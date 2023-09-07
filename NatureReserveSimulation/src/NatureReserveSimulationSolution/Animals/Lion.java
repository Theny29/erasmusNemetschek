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
public class Lion extends Animal{
    
    public Lion() {
        super(AnimalsRegister.Lion, 50, new Food[]{new Food(FoodRegister.Meat, 10), new Food(FoodRegister.Mouse, 5), new Food(FoodRegister.Snake, 5)}, "GRRR");
    }
    
    
    
}
