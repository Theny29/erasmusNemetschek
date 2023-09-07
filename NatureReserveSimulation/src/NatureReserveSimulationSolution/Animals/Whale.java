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
        super(AnimalsRegister.Whale, 80, new Food[]{new Food(FoodRegister.Plankton, 10), new Food(FoodRegister.Fish, 10)}, "IL COCCODRILLO COME FA");
    }
    
}
