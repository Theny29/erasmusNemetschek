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
public class Sea extends Biome {

    public Sea() {
        super("Sea", Arrays.asList(AnimalsRegister.Fish.toString(), AnimalsRegister.Frog.toString(), AnimalsRegister.Snake.toString()), Arrays.asList(PlantsRegister.Grass.toString(), PlantsRegister.Fruit.toString()));
    }
    
}
