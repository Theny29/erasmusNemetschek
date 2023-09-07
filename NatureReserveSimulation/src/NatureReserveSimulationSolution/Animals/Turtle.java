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
public class Turtle extends Animal{
    
    public Turtle() {
        super(AnimalsRegister.Turtle, 78, new Food[]{new Food(FoodRegister.Grass, 3), new Food(FoodRegister.Flower, 5), new Food(FoodRegister.Berry, 8)}, "MHHH");
    }
    
}
