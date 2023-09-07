/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Food.*;

/**
 *
 * @author Daniele Perottoni
 */
public class Animal {

    private AnimalsRegister name;
    private Food[] diet;
    private int maxEnergy;
    private int currEnergy;
    private String verse;

    public Animal(AnimalsRegister name, int maxEnergy, final Food[] diet, String verse) {
        this.name = name;
        this.diet = diet;
        this.maxEnergy = maxEnergy;
        this.currEnergy = maxEnergy;
        this.verse = verse;
    }

    public AnimalsRegister getName() {
        return name;
    }

    public void setName(AnimalsRegister name) {
        this.name = name;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public int getCurrEnergy() {
        return currEnergy;
    }

    public void setCurrEnergy(int currEnergy) {
        this.currEnergy = currEnergy;
    }

    public Food[] getDiet() {
        return diet;
    }

    public void setDiet(Food[] diet) {
        this.diet = diet;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public boolean isInDiet(Food food) {
        boolean isInDiet = false;
        for (Food item : diet) {
            if (item.equals(food)) {
                isInDiet = true;
            }
        }
        return isInDiet;
    }

    public void increaseEnergy(Food food) {
        setCurrEnergy(currEnergy + food.getNutritionValue());
        if (currEnergy > maxEnergy) {
            currEnergy = maxEnergy;
        }
    }

    public void decreaseEnergy(Food food) {
        setCurrEnergy(currEnergy-1);
    }

}
