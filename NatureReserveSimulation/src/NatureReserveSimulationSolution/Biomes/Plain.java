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
public class Plain extends Biome {

    public Plain() {
        super("Plain", currentAnimals, Arrays.asList(AnimalsRegister.Bird, AnimalsRegister.Insect, AnimalsRegister.Mouse) , supportedFood);
    }
    
    
}
