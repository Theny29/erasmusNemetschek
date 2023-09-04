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
public class Animal {
    
    private AnimalsRegister name;
    private Food[] diet;
    private int maxEnergy;
    private int currEnergy;

    public Animal(AnimalsRegister name, int maxEnergy, Food[] diet) {
        this.setName(name);
        this.setDiet(diet);
        this.setMaxEnergy(maxEnergy);
        this.currEnergy = maxEnergy;
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

    public boolean isInDiet(Food food) {
        boolean isInDiet;
        if(this.getDiet().contains(food)) this.setCurrEnergy(getCurrEnergy() + food.getNutritionValue());
        else this.setCurrEnergy(getCurrEnergy() - food.getNutritionValue());
        return isInDiet;
    }
    
    
}
