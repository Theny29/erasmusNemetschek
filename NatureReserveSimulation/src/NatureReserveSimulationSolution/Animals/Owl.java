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
        super(AnimalsRegister.Owl, 50,  new Food[]{new Food(FoodRegister.Bird, 5), new Food(FoodRegister.Mouse, 5), new Food(FoodRegister.Insect, 8)}, "UHUHH");
    }
    
}
