/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Food.*;
import java.util.ArrayList;

/**
 *
 * @author Daniele Perottoni
 */
public abstract class Animal {

    private AnimalsRegister name;
    protected ArrayList<Food> diet;
    private int maxEnergy;
    private int currEnergy;
    private String verse;
    private int currentAge;
    private int maxAge;

    public Animal(AnimalsRegister name, int maxEnergy, int maxAge, String verse) {
        this.name = name;
        this.maxAge = maxAge;
        this.maxEnergy = maxEnergy;
        this.currEnergy = maxEnergy;
        this.verse = verse;
        this.diet = new ArrayList<>();
        this.currentAge = 0;
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

    public ArrayList<Food> getDiet() {
        return diet;
    }

    public void setDiet(ArrayList<Food> diet) {
        this.diet = diet;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
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
    
    public abstract void foodToAdd();

}
