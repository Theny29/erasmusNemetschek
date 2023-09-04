/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Food.*;
import java.util.ArrayList;

/**
 *
 * @author Erasmus1
 */
public class Turtle extends Animal{
    
    public Turtle() {
        super(AnimalsRegister.Turtle, 50, new Food[]{new Food(FoodRegister.Grass, 5), new Food(FoodRegister.Flower, 5), new Food(FoodRegister.Berry, 10)});
    }
    
}
