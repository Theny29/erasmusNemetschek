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
public class Lion extends Animal{
    
    public Lion() {
        super(AnimalsRegister.Lion, 150, 20, "GRRR");
        diet.add(new Food(FoodRegister.Meat, 10));
        diet.add(new Food(FoodRegister.Snake, 5));
    }
    
    @Override
    public void foodToAdd() {
        diet.add(new Food(FoodRegister.Mouse, 5));
    }
    
    
}
