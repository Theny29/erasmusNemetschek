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
public class Shark extends Animal{
    
    public Shark() {
        super(AnimalsRegister.Shark, 150, new Food[]{new Food(FoodRegister.Fish, 20), new Food(FoodRegister.Squid, 15)});
    }
    
}
