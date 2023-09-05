/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Statistics;

import NatureReserveSimulationSolution.Animals.Animal;
import java.util.ArrayList;

/**
 *
 * @author Erasmus1
 */
public final class Statistics {
    
    private static int minimum;
    private static int maximum;
    private double average;
    private int numAnimals;
    private static ArrayList<Integer> lifespanStorage;

    public Statistics(int numAnimals) {
        this.minimum = Integer.MAX_VALUE;
        this.maximum = Integer.MIN_VALUE;
        this.numAnimals = numAnimals;
        this.lifespanStorage = new ArrayList<>();
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    
    public static void updateStatistics(int lifespan) {
        lifespanStorage.add(lifespan);
        
        for (int number : lifespanStorage) {
            if (number < minimum) {
                minimum = number;
            }
            if (number > maximum) {
                maximum = number;
            }
        }
    }
    
    public void calcAverageLifespan() {
        int sum = 0;
        for(int i = 0; i < lifespanStorage.size(); i++) sum += lifespanStorage.get(i);
        setAverage((double) sum/this.numAnimals);
    }

    @Override
    public String toString() {
        return "STATISTICS:\n" + "minium = " + minimum + ", maximum = " + maximum + ", average = " + average;
    }
    
    
}
