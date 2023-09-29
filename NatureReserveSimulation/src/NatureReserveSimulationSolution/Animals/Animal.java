/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

import NatureReserveSimulationSolution.Biomes.Biome;
import NatureReserveSimulationSolution.Food.*;
import NatureReserveSimulationSolution.Statistics.Statistics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Daniele Perottoni
 */
public abstract class Animal implements iFood {

    private final AnimalsRegister name;
    private final int maxEnergy;
    private final int maxAge;
    private final String verse;

    protected ArrayList<String> diet;
    private int nutritionValue;
    private int currEnergy;
    private int currentAge;
    private boolean isAlive;

    public Animal(AnimalsRegister name, int maxEnergy, int maxAge, String verse) {
        this.name = name;
        this.maxEnergy = maxEnergy;
        this.maxAge = maxAge;
        this.verse = verse;
        this.diet = new ArrayList<>();
        this.nutritionValue = maxEnergy;
        this.currEnergy = maxEnergy;
        this.currentAge = 0;
        this.isAlive = true;
    }

    public String getName() {
        return name.toString();
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getCurrEnergy() {
        return currEnergy;
    }

    public void setCurrEnergy(int currEnergy) {
        this.currEnergy = currEnergy;
    }

    public String getVerse() {
        return verse;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public int getNutritionValue() {
        return nutritionValue;
    }

    @Override
    public void setNutritionValue(int nutritionValue) {
        this.nutritionValue = nutritionValue;
    }

    public boolean isInDiet(iFood food) {
        boolean isInDiet = false;
        for (String item : diet) {
            if (item.equals(food.getName())) {
                isInDiet = true;
            }
        }
        return isInDiet;
    }

    public void increaseEnergy(int energy) {
        setCurrEnergy(currEnergy + energy);
        if (currEnergy > maxEnergy) {
            currEnergy = maxEnergy;
        }
    }

    public void starve() {
        setCurrEnergy(currEnergy - 1);
        if (getCurrEnergy() <= (getMaxEnergy() / 2)) {
            System.out.print(getVerse() + " ");
        }
        if (getCurrEnergy() <= 0) {
            die();
        }
    }

    public void die() {
        setIsAlive(false);
    }

    public void increaseAge() {
        setCurrentAge(currentAge + 1);
    }

    public void move(Biome currentBiome, List<Biome> adjacentBiomes) {
        if (currentBiome.supportsAnimal(getName())) {
            if (!adjacentBiomes.isEmpty()) {
                Random random = new Random();
                Biome nextBiome = adjacentBiomes.get(random.nextInt(adjacentBiomes.size()));

                currentBiome.removeAnimal(this);
                nextBiome.addAnimal(this);
            }
        }
    }

    @Override
    public void getEaten() {
        die();
    }

    public abstract void addFood();

}
