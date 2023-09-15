/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Plants.*;

/**
 *
 * @author Erasmus1
 */
public class Mouse extends Animal{
    
    public Mouse() {
        super(AnimalsRegister.Mouse, 240, 70, "IL COCCODRILLO COME FA");
        diet.add(PlantsRegister.Fruit.toString());
        diet.add(AnimalsRegister.Insect.toString());

    }
    
    @Override
    public void addFood() {
        diet.add(PlantsRegister.Grass.toString());
    }
    
}
