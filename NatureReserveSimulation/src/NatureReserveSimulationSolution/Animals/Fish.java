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
public class Fish extends Animal{
    
    public Fish() {
        super(AnimalsRegister.Fish, 219, 70, "PFFF");
        diet.add(AnimalsRegister.Snake.toString());
        diet.add(PlantsRegister.Grass.toString());
    }
    
    @Override
    public void addFood(){
        diet.add(AnimalsRegister.Fish.toString());
    }
    
}
