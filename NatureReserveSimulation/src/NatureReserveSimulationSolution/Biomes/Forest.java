/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Biomes;

import NatureReserveSimulationSolution.Animals.AnimalsRegister;
import java.util.Arrays;

/**
 *
 * @author Erasmus1
 */
public class Forest extends Biome {

    public Forest() {
        super("Forest", currentAnimals, Arrays.asList(AnimalsRegister.Deer, AnimalsRegister.Wolf), supportedFood);
    }
    
}
