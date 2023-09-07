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
public class Elephant extends Animal{
    
    public Elephant() {
        super(AnimalsRegister.Elephant, 73, new Food[]{new Food(FoodRegister.Leaf, 5), new Food(FoodRegister.Berry, 8), new Food(FoodRegister.Grass, 3)}, "PFFF");
    }
    
}
