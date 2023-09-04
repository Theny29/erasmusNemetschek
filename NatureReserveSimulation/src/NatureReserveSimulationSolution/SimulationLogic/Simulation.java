/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Statistics.Statistics;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Erasmus1
 */
public class Simulation {
    
    private ArrayList<Animal> animals;
    private Statistics statistics;

    public Simulation(int numAnimals) {
        animals = new ArrayList();
        statistics = new Statistics();
        createRandomAnimals(numAnimals);
    }
    
    private void createRandomAnimals(int numAnimals) {
        Random random = new Random();
        for (int i = 0; i < numAnimals; i++) {
            int animalType = random.nextInt(8);
            Animal animal;
            switch (animalType) {
                case 0:
                    animal = new Lion();
                    break;
                case 1:
                    animal = new Crocodile();
                    break;
                case 2:
                    animal = new Whale();
                    break;
                case 3:
                    animal = new Frog();
                    break;
                case 4:
                    animal = new Shark();
                    break;
                case 5:
                    animal = new Owl();
                    break;
                case 6:
                    animal = new Turtle();
                    break;
                case 7:
                    animal = new Elephant();
                    break;
                default:
                    animal = new Lion();
            }
            animals.add(animal);
        }
    }
    
    public void runSimulation() {
        Random random = new Random();
        for (int turn = 1; turn <= maxTurns; turn++) {
            for (Animal animal : animals) {
                int foodType = random.nextInt(12);
                
                // Aggiorna la durata della vita dell'animale
                int lifespan = /* calcola la durata della vita */;
                statistics.updateStatistics(lifespan);
            }
        }
        statistics.calculateAverage(animals.size());
    } 
    
}
