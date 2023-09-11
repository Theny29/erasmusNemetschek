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
public class Shark extends Animal{
    
    public Shark() {
        super(AnimalsRegister.Shark, 144, 30, "GNAM");
        diet.add(new Food(FoodRegister.Fish, 10));
        diet.add(new Food(FoodRegister.Crustacean, 5));

    }
    
    @Override
    public void addFood() {
        diet.add(new Food(FoodRegister.Squid, 5));
    }
    
}
