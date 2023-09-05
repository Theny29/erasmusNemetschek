/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Food.Food;
import NatureReserveSimulationSolution.Statistics.Statistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Erasmus1
 */
public class Simulation {

    private final ArrayList<Animal> animals;
    private final Statistics statistics;
    private int lifespan = 0;

    public Simulation(int numAnimals) {
        animals = new ArrayList();
        statistics = new Statistics(numAnimals);
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

    public void runSimulation(ArrayList<Food> foodList) {
        Random random = new Random();

        while (!animals.isEmpty()) {        
            Iterator<Animal> iteratorAnimals = animals.iterator();
            while (iteratorAnimals.hasNext()) {
                Animal animal = iteratorAnimals.next();
                int randomIndex = random.nextInt(foodList.size());
                Food randomFood = foodList.get(randomIndex);
                if (animal.isInDiet(randomFood)) {
                    animal.increaseEnergy(randomFood);
                } else {
                    animal.decreaseEnergy(randomFood);
                }

                if (animal.getCurrEnergy() <= 0) {
                    iteratorAnimals.remove();
                    Statistics.updateStatistics(lifespan);
                }
            }
            lifespan++;
        }
        statistics.calcAverageLifespan();
        System.out.println(statistics.toString());
    }

}
