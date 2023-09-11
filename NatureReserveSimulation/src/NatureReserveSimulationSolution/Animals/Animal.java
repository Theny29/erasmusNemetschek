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

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getCurrEnergy() {
        return currEnergy;
    }

    public void setCurrEnergy(int currEnergy) {
        this.currEnergy = currEnergy;
    }

    public String getVerse() {
        return verse;
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
        setCurrEnergy(currEnergy - 1);
    }
    
    public abstract void foodToAdd();

}
