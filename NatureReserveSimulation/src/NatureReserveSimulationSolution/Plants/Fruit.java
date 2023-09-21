/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Plants;

/**
 *
 * @author Erasmus1
 */
public class Fruit extends Plant {

    public Fruit() {
        super(PlantsRegister.Fruit, 40);
    }
    
    @Override
    public void regenerate() {
        setNutritionValue(getNutritionValue() + 1);
        if (getNutritionValue() > getMaxNutritionalValue()) setNutritionValue(getMaxNutritionalValue());
    }
}
