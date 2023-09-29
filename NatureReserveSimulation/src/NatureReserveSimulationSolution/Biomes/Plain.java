/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Biomes;

import NatureReserveSimulationSolution.Animals.AnimalsRegister;
import NatureReserveSimulationSolution.Plants.PlantsRegister;
import java.util.Arrays;

/**
 *
 * @author Erasmus1
 */
public class Plain extends Biome {

    public Plain() {
        super("Plain", Arrays.asList(AnimalsRegister.Bird.toString(), AnimalsRegister.Lion.toString(), AnimalsRegister.Zebra.toString(), AnimalsRegister.Fish.toString()) , Arrays.asList(PlantsRegister.Grass.toString(), PlantsRegister.Fruit.toString()));
    }
    
    
}
