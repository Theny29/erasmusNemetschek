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
public class Frog extends Animal{
    
    public Frog() {
        super(AnimalsRegister.Frog, 129, 10, "CROAC");
        diet.add(new Food(FoodRegister.Insect, 8));
        diet.add(new Food(FoodRegister.seaGrass, 5));
        
    }
    
    @Override
    public void addFood() {
        diet.add(new Food(FoodRegister.Worms, 5));
    }
}
