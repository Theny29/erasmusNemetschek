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
public class Owl extends Animal{
    
    public Owl() {
        super(AnimalsRegister.Owl, 150, 25, "UHUHH");
        diet.add(new Food(FoodRegister.Insect, 8));
        diet.add(new Food(FoodRegister.Mouse, 5));
    }
    
    @Override
    public void addFood() {
        diet.add(new Food(FoodRegister.Bird, 5));
    }
    
}
