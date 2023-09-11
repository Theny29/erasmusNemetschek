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
        super(AnimalsRegister.Turtle, 234, 150, "MHHH");
        diet.add(new Food(FoodRegister.Berry, 8));
        diet.add(new Food(FoodRegister.Flower, 5));

    }
    
    @Override
    public void addFood() {
        diet.add(new Food(FoodRegister.Grass, 3));
    }
    
}
