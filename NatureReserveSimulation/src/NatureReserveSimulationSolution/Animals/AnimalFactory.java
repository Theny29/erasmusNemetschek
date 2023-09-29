/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Biomes.Biome;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 *
 * @author Daniele Perottoni
 */
public class AnimalFactory {
    private HashMap<String, Supplier<Animal>> animalMap;
    private Biome currentBiome;

    public AnimalFactory(HashMap<String, Supplier<Animal>> animalMap, Biome currentBiome) {
        this.animalMap = animalMap;
        this.currentBiome = currentBiome;
    }

    public ArrayList<Animal> createRandomAnimals() {
        List<String> supportedSpecies = currentBiome.getSupportedAnimals();
        ArrayList<Animal> animals = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(supportedSpecies.size());
            String selectedAnimalName = supportedSpecies.get(randomIndex);
            Supplier<Animal> animalSupplier = animalMap.get(selectedAnimalName);
            animals.add(animalSupplier.get());
        }

        return animals;
    }

}
