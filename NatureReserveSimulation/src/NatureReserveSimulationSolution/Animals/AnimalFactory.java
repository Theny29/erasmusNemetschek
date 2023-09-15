/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Daniele Perottoni
 */
public class AnimalFactory {
    
    private final ArrayList<Animal> animals;

    public AnimalFactory() {
        this.animals = new ArrayList<>();
    }

    public ArrayList<Animal> createRandomAnimals(int numAnimals) {
        Random random = new Random();
        for (int i = 0; i < numAnimals; i++) {
            int animalType = random.nextInt(8);
            Animal animal;
            switch (animalType) {
                case 0:
                    animal = new Lion();
                    break;
                case 1:
                    animal = new Zebra();
                    break;
                case 2:
                    animal = new Snake();
                    break;
                case 3:
                    animal = new Frog();
                    break;
                case 4:
                    animal = new Mouse();
                    break;
                case 5:
                    animal = new Fish();
                    break;
                case 6:
                    animal = new Insect();
                    break;
                case 7:
                    animal = new Bird();
                    break;
                default:
                    animal = new Lion();
            }
            animals.add(animal);
        }
        return animals;
    }
}
