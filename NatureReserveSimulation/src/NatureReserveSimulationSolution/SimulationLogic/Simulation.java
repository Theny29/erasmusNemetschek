/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Plants.*;
import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Food.iFood;
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
    private final ArrayList<Plant> plants;
    private final ArrayList<iFood> allFoods;
    private final Statistics statistics;
    private int lifespan = 0;

    public Simulation(AnimalFactory animalFactory, PlantFactory plantFactory, int numAnimals, int numPlants) {
        this.animals = animalFactory.createRandomAnimals(numAnimals);
        this.plants = plantFactory.createRandomPlants(numPlants);
        this.allFoods = combineArrays(animals, plants);
        statistics = new Statistics(animals.size());
    }
    
    private ArrayList<iFood> combineArrays(ArrayList<Animal> animals, ArrayList<Plant> plants) {
        ArrayList<iFood> foods = new ArrayList<>();
        foods.addAll(animals);
        foods.addAll(plants);
        return foods;
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
            feedAnimal(animal);
            checkAnimalStatus(animal, iteratorAnimals);
        }
        lifespan++;
        regeneratesPlants();
    }

    private void feedAnimal(Animal animal) {
        Random random = new Random();
        int randomIndex = random.nextInt(allFoods.size());
        iFood randomFood = allFoods.get(randomIndex);
        if (animal.isInDiet(randomFood)) {
            animal.increaseEnergy(randomFood);
            System.out.println(animal.getName().toUpperCase() + " ate " + randomFood.getName() + " and gained " + randomFood.getNutritionValue() + " energy. ENERGY: " + animal.getCurrEnergy() + "\n");
            checkRandomFood(randomFood, animal);
        } else {
            animal.starve(randomFood);
            System.out.println(animal.getName().toUpperCase() + " ate " + randomFood.getName() + " and lost 1 energy\n");
        }
    }
    
    private void checkRandomFood(iFood randomFood, Animal animal) {
        if (randomFood instanceof Animal) {
            if ((animal.getMaxEnergy() - animal.getCurrEnergy()) > randomFood.getNutritionValue()) {
                allFoods.remove(randomFood);
            } else {
                randomFood.setNutritionValue(animal.getMaxEnergy() - animal.getCurrEnergy());
            }
            animal.setIsAlive(false);
        } else {
            randomFood.getEaten();
        }
    }

    private void checkAnimalStatus(Animal animal, Iterator<Animal> iteratorAnimals) {
        if (lifespan % 365 == 0) animal.increaseAge();
        System.out.println(animal.getCurrentAge());
        if (animal.getCurrentAge() > animal.getMaxAge() / 2) animal.addFood();

        if (animal.getCurrEnergy() <= (animal.getMaxEnergy() / 2)) {
            System.out.println(animal.getVerse());
        }
        checkDead(animal, iteratorAnimals);
    }
    
    private void checkDead(Animal animal, Iterator<Animal> iteratorAnimals) {
        if (animal.getCurrEnergy() <= 0 || animal.getCurrentAge() > animal.getMaxAge()) {
            Statistics.updateStatistics(lifespan, animal.getName());
            System.out.println(animal.getName().toUpperCase() + " is dead");
            iteratorAnimals.remove();
        }
    }
    
    private void regeneratesPlants() {
        for (iFood food : allFoods) {
            if (food instanceof Plant) {
                ((Plant) food).regenerate();
            }
        }
    }

}
