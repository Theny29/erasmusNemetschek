/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Biomes;

import NatureReserveSimulationSolution.Animals.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erasmus1
 */
public abstract class Biome {
    
    private String name;
    private List<Animal> currentAnimals;
    private final List<String> supportedAnimals;
    private final List<String> supportedFood;

    public Biome(String name, ArrayList<Animal> currentAnimals, ArrayList<String> supportedAnimals, ArrayList<String> supportedFood) {
        this.name = name;
        this.currentAnimals = currentAnimals;
        this.supportedAnimals = supportedAnimals;
        this.supportedFood = supportedFood;
    }

    
    
    
}
