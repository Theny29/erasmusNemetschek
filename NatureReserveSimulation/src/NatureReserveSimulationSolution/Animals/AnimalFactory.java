/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Supplier;

/**
 *
 * @author Daniele Perottoni
 */
public class AnimalFactory {
    
    private HashMap<String, Supplier<Animal>> animalMap;

    public AnimalFactory(HashMap<String, Supplier<Animal>> animalMap) {
        this.animalMap = animalMap;
    }

    public ArrayList<Animal> createRandomAnimals(int numAnimals) {
        ArrayList<Animal> animals = new ArrayList<>();

        for (int i = 0; i < numAnimals; i++) {
            Object[] animalNames = animalMap.keySet().toArray();

            Random random = new Random();
            int randomIndex = random.nextInt(animalNames.length);

            String selectedAnimalName = (String) animalNames[randomIndex];

            Supplier<Animal> animalSupplier = animalMap.get(selectedAnimalName);

            animals.add(animalSupplier.get());
        }

        return animals;
    }
}
