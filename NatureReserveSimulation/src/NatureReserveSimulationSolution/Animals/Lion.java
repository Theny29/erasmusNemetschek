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
public class Lion extends Animal{
    
    public Lion() {
        super(AnimalsRegister.Lion, 150, new Food[]{new Food(FoodRegister.Meat, 20)});
    }
    
    
    
}
