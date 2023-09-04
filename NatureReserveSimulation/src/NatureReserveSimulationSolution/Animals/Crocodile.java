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
public class Crocodile extends Animal{
    
    public Crocodile() {
        super(AnimalsRegister.Crocodile, 150, new Food[]{new Food(FoodRegister.Snake, 15), new Food(FoodRegister.Bird, 15)});
    }
       
}
