/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Plants.*;

/**
 *
 * @author Erasmus1
 */
public class Frog extends Animal{
    
    public Frog() {
        super(AnimalsRegister.Frog, 129, 10, "CROAC");
        diet.add(AnimalsRegister.Insect.toString());
        diet.add(PlantsRegister.Grass.toString());
        
    }
    
    @Override
    public void addFood() {
        diet.add(AnimalsRegister.Snake.toString());
    }
}
