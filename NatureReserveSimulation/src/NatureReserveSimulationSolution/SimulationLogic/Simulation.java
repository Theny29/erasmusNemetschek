/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Plants.*;
import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Food.iFood;
import NatureReserveSimulationSolution.Statistics.Statistics;
import NatureReserveSimulationTest.UI.UIService;
import java.util.ArrayList;
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
    private UIService uiService;
    private int lifespan = 0;

    public Simulation(AnimalFactory animalFactory, PlantFactory plantFactory, int numAnimals, int numPlants, UIService uiService) {
        this.animals = animalFactory.createRandomAnimals(numAnimals);
        this.plants = plantFactory.createRandomPlants(numPlants);
        this.allFoods = combineArrays(animals, plants);
        this.uiService = uiService;
        statistics = new Statistics(animals.size());
    }

    private ArrayList<iFood> combineArrays(ArrayList<Animal> animals, ArrayList<Plant> plants) {
        ArrayList<iFood> foods = new ArrayList<>();
        foods.addAll(animals);
        foods.addAll(plants);
        return foods;
    }

    public void runSimulation() {
        for (int i = 0; i < allFoods.size(); i++) {
            System.out.println(allFoods.get(i).getName() + " " + allFoods.get(i).getNutritionValue());
        }
        while (animals.stream().anyMatch(Animal::isIsAlive)) {
            runDay();
        }
        statistics.calcAverageLifespan();
        System.out.println(statistics.toString());
    }

    private void runDay() {
        if (lifespan % 365 == 0) {
            System.out.println("----------");
            System.out.println("YEAR: " + (lifespan / 356));
            System.out.println("----------");
            uiService.displaySummary(lifespan / 356, lifespan, lifespan);
            uiService.displayDetails(animals);

        }
        for (Animal animal : animals) {
            if (animal.isIsAlive()) {
                feedAnimal(animal);
                checkAnimalStatus(animal);
            }
        }
        lifespan++;
        regeneratesPlants();
    }

    private void feedAnimal(Animal animal) {
        iFood randomFood = getRandomFood(animal);
        if (animal.isInDiet(randomFood) && (randomFood.getNutritionValue() > 0)) {
            animal.increaseEnergy(randomFood.getNutritionValue());
            System.out.print(animal.getName().toUpperCase() + " ate " + randomFood.getName() + ". ENERGY: " + animal.getCurrEnergy() + "\n");
            checkRandomFood(randomFood, animal);
        } else {
            animal.starve();
            System.out.print(animal.getName().toUpperCase() + " didn't eat " + randomFood.getName() + " and lost 1 energy\n");
        }
    }

    private iFood getRandomFood(Animal animal) {
        Random random = new Random();
        iFood selectedFood = null;
        while (selectedFood == null || selectedFood == animal) {
            int randomIndex = random.nextInt(allFoods.size());
            selectedFood = allFoods.get(randomIndex);
        }
        return selectedFood;
    }

    private void checkRandomFood(iFood randomFood, Animal animal) {
        if (randomFood instanceof Animal) {
            if ((animal.getMaxEnergy() - animal.getCurrEnergy()) > randomFood.getNutritionValue()) {
                randomFood.setNutritionValue(0);
            } else {
                randomFood.setNutritionValue(animal.getMaxEnergy() - animal.getCurrEnergy());
            }
            for (Animal findAnimal : animals) {
                if (findAnimal.equals(randomFood)) {
                    Statistics.updateStatistics(lifespan, findAnimal.getName());
                    findAnimal.getEaten();
                }
            }
        } else if (randomFood instanceof Plant) {
            randomFood.getEaten();
        }
    }

    private void checkAnimalStatus(Animal animal) {
        if (lifespan % 365 == 0) {
            animal.increaseAge();
        }

        if (animal.getCurrentAge() > animal.getMaxAge() / 2) {
            animal.addFood();
        }

        checkDead(animal);
    }

    private void checkDead(Animal animal) {
        if (animal.getCurrEnergy() <= 0 || animal.getCurrentAge() > animal.getMaxAge()) {
            Statistics.updateStatistics(lifespan, animal.getName());
            System.out.println(animal.getName().toUpperCase() + " is dead");
            animal.die();
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
