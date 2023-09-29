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

    private final String name;
    private List<Animal> currentAnimals;
    private final List<String> supportedAnimals;
    private final List<String> supportedFood;

    public Biome(String name, List<String> supportedAnimals, List<String> supportedFood) {
        this.name = name;
        this.currentAnimals = fillAnimals();
        this.supportedAnimals = supportedAnimals;
        this.supportedFood = supportedFood;
    }

    public void setCurrentAnimals(List<Animal> currentAnimals) {
        this.currentAnimals = currentAnimals;
    }

    public List<String> getSupportedAnimals() {
        return supportedAnimals;
    }
    
    private List<Animal> fillAnimals() {
        return 
    }
    
    public void addAnimal(Animal animal) {
        currentAnimals.add(animal);
    }
    
    public void removeAnimal(Animal animal) {
        currentAnimals.remove(animal);
    }
    
    public boolean supportsAnimal(String animalName) {
        if (supportedAnimals.contains(animalName)) return true;
        return false;
    }

}
