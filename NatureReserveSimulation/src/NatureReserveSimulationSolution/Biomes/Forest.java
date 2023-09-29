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
public class Forest extends Biome {

    public Forest() {
        super("Forest", Arrays.asList(AnimalsRegister.Bird.toString(), AnimalsRegister.Frog.toString(), AnimalsRegister.Insect.toString(), AnimalsRegister.Mouse.toString(), AnimalsRegister.Snake.toString()), Arrays.asList(PlantsRegister.Fruit.toString(), PlantsRegister.Leaf.toString()));
    }
    
}
