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
public class Owl extends Animal{
    
    public Owl() {
        super(AnimalsRegister.Owl, 50,  new Food[]{new Food(FoodRegister.Mouse, 15), new Food(FoodRegister.Bird, 15), new Food(FoodRegister.Insect, 10)});
    }
    
}
