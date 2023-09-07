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
public class Crocodile extends Animal{
    
    public Crocodile() {
        super(AnimalsRegister.Crocodile, 54, new Food[]{new Food(FoodRegister.Fish, 10), new Food(FoodRegister.Bird, 5), new Food(FoodRegister.Snake, 5)}, "STRIKGNAK");
    }
       
}
