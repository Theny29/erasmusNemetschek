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
public class Elephant extends Animal{
    
    public Elephant() {
        super(AnimalsRegister.Elephant, 100, new Food[]{new Food(FoodRegister.Leaf, 10), new Food(FoodRegister.Grass, 5), new Food(FoodRegister.Insect, 10)});
    }
    
}
