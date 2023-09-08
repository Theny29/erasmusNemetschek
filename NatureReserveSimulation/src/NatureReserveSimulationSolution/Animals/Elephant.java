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
        super(AnimalsRegister.Elephant, 219, 70, "PFFF");
        diet.add(new Food(FoodRegister.Berry, 8));
        diet.add(new Food(FoodRegister.Leaf, 5));
    }
    
    @Override
    public void foodToAdd(){
        diet.add(new Food(FoodRegister.Grass, 3));
    }
    
}
