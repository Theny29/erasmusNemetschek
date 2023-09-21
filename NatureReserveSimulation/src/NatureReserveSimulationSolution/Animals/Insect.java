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
public class Insect extends Animal{
    
    public Insect() {
        super(AnimalsRegister.Insect, 150, 20, "BZZZ");
        diet.add(PlantsRegister.Leaf.toString());
        diet.add(PlantsRegister.Fruit.toString());
        diet.add(AnimalsRegister.Insect.toString());

    }
    
    @Override
    public void addFood() {
        diet.add(AnimalsRegister.Insect.toString());
    }
    
}
