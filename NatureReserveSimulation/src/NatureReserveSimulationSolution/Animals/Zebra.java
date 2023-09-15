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
public class Zebra extends Animal{
    
    public Zebra() {
        super(AnimalsRegister.Zebra, 234, 150, "MHHH");
        diet.add(PlantsRegister.Grass.toString());
        diet.add(PlantsRegister.Leaf.toString());

    }
    
    @Override
    public void addFood() {
        diet.add(PlantsRegister.Fruit.toString());
    }
    
}
