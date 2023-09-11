/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Food.*;
import NatureReserveSimulationSolution.Statistics.Statistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Daniele Perottoni
 */
public class Simulation {

    private final ArrayList<Animal> animals;
    private final ArrayList<Food> food;
    private final Statistics statistics;
    private int lifespan = 0;

    public Simulation(AnimalFactory animalFactory, int numAnimals) {
        animals = animalFactory.createRandomAnimals(numAnimals);
        food = FoodFactory.crateFood();
        statistics = new Statistics(animals.size());
    }

    public void runSimulation() {
        Random random = new Random();

        while (!animals.isEmpty()) {        
            Iterator<Animal> iteratorAnimals = animals.iterator();
            //System.out.println("DAY: " + lifespan + "\n---------------");
            while (iteratorAnimals.hasNext()) {
                Animal animal = iteratorAnimals.next();
                if (lifespan % 365 == 0) animal.setCurrentAge(animal.getCurrentAge() + 1);
                //System.out.println(animal.getCurrentAge());
                if (animal.getCurrentAge() > animal.getMaxAge() / 2) animal.foodToAdd();
                int randomIndex = random.nextInt(food.size());
                Food randomFood = food.get(randomIndex);
                if (animal.isInDiet(randomFood)) {
                    animal.increaseEnergy(randomFood);
                    //System.out.println(animal.getName().toString().toUpperCase() + " ate " + randomFood.getName() + " and gained " + randomFood.getNutritionValue() + " energy. ENERGY: " + animal.getCurrEnergy() + "\n");
                } else {
                    animal.decreaseEnergy(randomFood);
                    //System.out.println(animal.getName().toString().toUpperCase() + " ate " + randomFood.getName() + " and lost 1 energy\n");
                }
                //if (animal.getCurrEnergy() <= (animal.getMaxEnergy() / 2)) System.out.println(animal.getVerse());
                if (animal.getCurrEnergy() <= 0 || animal.getCurrentAge() > animal.getMaxAge()) {
                    Statistics.updateStatistics(lifespan, animal.getName());
                    System.out.println(animal.getName().toString().toUpperCase() + " is dead");
                    iteratorAnimals.remove();
                }
            }
            lifespan++;
        }
        statistics.calcAverageLifespan();
        System.out.println(statistics.toString());
    }

}
