/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Plants;

import NatureReserveSimulationSolution.Food.iFood;

/**
 *
 * @author Daniele Perottoni
 */
public abstract class Plant implements iFood {
    
    private final PlantsRegister name;
    private int nutritionValue;
    private final int maxNutritionalValue;

    public Plant(PlantsRegister name, int nutritionValue, int maxNutritionalValue) {
        this.name = name;
        this.nutritionValue = nutritionValue;
        this.maxNutritionalValue = maxNutritionalValue;
    }

    public String getName() {
        return name.toString();
    }

    @Override
    public int getNutritionValue() {
        return nutritionValue;
    }
    
    @Override
    public void setNutritionValue(int nutritionValue) {
        this.nutritionValue = nutritionValue;
    }

    public int getMaxNutritionalValue() {
        return maxNutritionalValue;
    }
    
    @Override
    public void getEaten(){
        setNutritionValue(0);
    }
    
    public abstract void regenerate();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plant other = (Plant) obj;
        if (this.nutritionValue != other.nutritionValue) {
            return false;
        }
        return this.name == other.name;
    }
    
    
    
    
}
