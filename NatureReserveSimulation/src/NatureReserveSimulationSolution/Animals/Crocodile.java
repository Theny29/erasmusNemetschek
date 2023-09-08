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
        super(AnimalsRegister.Crocodile, 162, 70, "STRIKGNAK");
        diet.add(new Food(FoodRegister.Fish, 10));
        diet.add(new Food(FoodRegister.Snake, 5));
    }
    
    @Override
    public void foodToAdd() {
        diet.add(new Food(FoodRegister.Bird, 5));
    }
       
}
