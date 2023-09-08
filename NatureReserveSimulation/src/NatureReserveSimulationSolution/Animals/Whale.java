/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Food.*;

/**
 *
 * @author Erasmus1
 */
public class Whale extends Animal{
    
    public Whale() {
        super(AnimalsRegister.Whale, 240, 70, "IL COCCODRILLO COME FA");
        diet.add(new Food(FoodRegister.Plankton, 10));

    }
    
    @Override
    public void foodToAdd() {
        diet.add(new Food(FoodRegister.Fish, 10));
    }
    
}
