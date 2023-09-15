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
public class Bird extends Animal{
    
    public Bird() {
        super(AnimalsRegister.Bird, 144, 30, "CIP CIP");
        diet.add(PlantsRegister.Fruit.toString());
        diet.add(AnimalsRegister.Fish.toString());

    }
    
    @Override
    public void addFood() {
        diet.add(AnimalsRegister.Snake.toString());
    }
    
}
