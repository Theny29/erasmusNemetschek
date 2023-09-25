/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Biomes;

import NatureReserveSimulationSolution.Animals.Animal;
import java.util.ArrayList;

/**
 *
 * @author Erasmus1
 */
public class Savannah extends Biome {

    public Savannah() {
        super("Savannah", currentAnimals, Arrays.asList(AnimalsRegister.Lion), supportedFood);
    }
    
}
