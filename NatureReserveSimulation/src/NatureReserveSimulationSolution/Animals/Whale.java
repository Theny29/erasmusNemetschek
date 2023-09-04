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
public class Whale extends Animal{
    
    public Whale() {
        super(AnimalsRegister.Whale, 100, new Food[]{new Food(FoodRegister.Plankton, 10)});
    }
    
}
