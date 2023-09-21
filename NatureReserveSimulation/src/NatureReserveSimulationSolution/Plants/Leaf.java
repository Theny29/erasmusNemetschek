/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Plants;

/**
 *
 * @author Erasmus1
 */
public class Leaf extends Plant {

    public Leaf() {
        super(PlantsRegister.Leaf, 30);
    }

    @Override
    public void regenerate() {
        setNutritionValue(getNutritionValue() + 2);
        if (getNutritionValue() > getMaxNutritionalValue()) setNutritionValue(getMaxNutritionalValue());
    }
    
}
