/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Plants;

/**
 *
 * @author Erasmus1
 */
public class Grass extends Plant {

    public Grass() {
        super(PlantsRegister.Grass, 20);
    }
    
    @Override
    public void regenerate() {
        setNutritionValue(getNutritionValue() + 3);
        if (getNutritionValue() > getMaxNutritionalValue()) setNutritionValue(getMaxNutritionalValue());
    }
}
