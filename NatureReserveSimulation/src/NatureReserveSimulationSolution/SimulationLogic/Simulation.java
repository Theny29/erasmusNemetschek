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
        food = FoodFactory.createFood();
        statistics = new Statistics(animals.size());
    }

    public void runSimulation() {
        while (!animals.isEmpty()) {
            runDay();
        }
        statistics.calcAverageLifespan();
        System.out.println(statistics.toString());
    }

    private void runDay() {
        Iterator<Animal> iteratorAnimals = animals.iterator();
        System.out.println("DAY: " + lifespan + "\n---------------");
        while (iteratorAnimals.hasNext()) {
            Animal animal = iteratorAnimals.next();
            
            if (lifespan % 365 == 0) animal.increaseAge();
            System.out.println(animal.getCurrentAge());
            if (animal.getCurrentAge() > animal.getMaxAge() / 2) animal.addFood();
            
            feedAnimal(animal);
            checkAnimalStatus(animal, iteratorAnimals);
        }
        lifespan++;
    }

    private void feedAnimal(Animal animal) {
        Random random = new Random();
        int randomIndex = random.nextInt(food.size());
        Food randomFood = food.get(randomIndex);
        if (animal.isInDiet(randomFood)) {
            animal.increaseEnergy(randomFood);
            System.out.println(animal.getName().toString().toUpperCase() + " ate " + randomFood.getName() + " and gained " + randomFood.getNutritionValue() + " energy. ENERGY: " + animal.getCurrEnergy() + "\n");
        } else {
            animal.decreaseEnergy(randomFood);
            System.out.println(animal.getName().toString().toUpperCase() + " ate " + randomFood.getName() + " and lost 1 energy\n");
        }
    }

    private void checkAnimalStatus(Animal animal, Iterator<Animal> iteratorAnimals) {
        if (animal.getCurrEnergy() <= (animal.getMaxEnergy() / 2)) {
            System.out.println(animal.getVerse());
        }
        if (animal.getCurrEnergy() <= 0 || animal.getCurrentAge() > animal.getMaxAge()) {
            Statistics.updateStatistics(lifespan, animal.getName());
            System.out.println(animal.getName().toString().toUpperCase() + " is dead");
            iteratorAnimals.remove();
        }
    }

}
