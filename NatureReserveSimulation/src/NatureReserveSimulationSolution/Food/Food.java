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
    
    private FoodRegister name;
    private int nutritionValue;

    public Food(FoodRegister name, int nutritionValue) {
        this.name = name;
        this.nutritionValue = nutritionValue;
    }

    public FoodRegister getName() {
        return name;
    }

    public void setName(FoodRegister name) {
        this.name = name;
    }

    public int getNutritionValue() {
        return nutritionValue;
    }

    public void setNutritionValue(int nutritionValue) {
        this.nutritionValue = nutritionValue;
    }
    
    
    
    
}
