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
public class Frog extends Animal{
    
    public Frog() {
        super(AnimalsRegister.Frog, 50,  new Food[]{new Food(FoodRegister.Insect, 10)});
    }
    
}
