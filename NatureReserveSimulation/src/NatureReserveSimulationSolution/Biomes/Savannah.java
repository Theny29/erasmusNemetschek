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
public class Savannah extends Biome {

    public Savannah() {
        super("Savannah", Arrays.asList(AnimalsRegister.Lion.toString(), AnimalsRegister.Zebra.toString(), AnimalsRegister.Mouse.toString(), AnimalsRegister.Insect.toString()), Arrays.asList(PlantsRegister.Leaf.toString(), PlantsRegister.Grass.toString()));
    }
    
}
