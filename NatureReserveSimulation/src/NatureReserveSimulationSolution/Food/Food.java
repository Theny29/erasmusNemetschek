/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Food;

/**
 *
 * @author Daniele Perottoni
 */
public class Food {
    
    private final FoodRegister name;
    private final int nutritionValue;

    public Food(FoodRegister name, int nutritionValue) {
        this.name = name;
        this.nutritionValue = nutritionValue;
    }

    public FoodRegister getName() {
        return name;
    }


    public int getNutritionValue() {
        return nutritionValue;
    }

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
        final Food other = (Food) obj;
        if (this.nutritionValue != other.nutritionValue) {
            return false;
        }
        return this.name == other.name;
    }
    
    
    
    
}
