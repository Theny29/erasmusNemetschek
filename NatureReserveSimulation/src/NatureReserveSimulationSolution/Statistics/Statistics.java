/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Statistics;

import NatureReserveSimulationSolution.Animals.AnimalsRegister;
import java.util.ArrayList;

/**
 *
 * @author Daniele Perottoni
 */
public final class Statistics {
    
    private static int minimum;
    private static int maximum;
    private static String firstAnimal;
    private static String lastAnimal;
    private double average;
    private int numAnimals;
    private static ArrayList<Integer> lifespanStorage;

    public Statistics(int numAnimals) {
        this.minimum = Integer.MAX_VALUE;
        this.maximum = Integer.MIN_VALUE;
        this.numAnimals = numAnimals;
        this.lifespanStorage = new ArrayList<>();
    }
    
    public static void updateStatistics(int lifespan, String animal) {
        lifespanStorage.add(lifespan);
        
        for (int number : lifespanStorage) {
            if (number < minimum) {
                minimum = number;
                firstAnimal = animal;
            }
            if (number > maximum) {
                maximum = number;
                lastAnimal = animal;
            }
        }
    }
    
    public void calcAverageLifespan() {
        int sum = 0;
        for(int i = 0; i < lifespanStorage.size(); i++) sum += lifespanStorage.get(i);
        average = (double) sum/this.numAnimals;
    }

    @Override
    public String toString() {
        return "\nSTATISTICS:\n" + "minium = " + minimum + " animal: " + firstAnimal + "\nmaximum = " + maximum + " animal: " + lastAnimal +"\naverage = " + average;
    }
    
    
}
