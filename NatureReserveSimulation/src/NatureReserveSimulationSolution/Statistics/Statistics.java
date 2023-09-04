/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Statistics;

/**
 *
 * @author Erasmus1
 */
public class Statistics {
    
    private int minium;
    private int maximum;
    private int average;

    public int getMinium() {
        return minium;
    }

    public void setMinium(int minium) {
        this.minium = minium;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "statistics{" + "minium=" + minium + ", maximum=" + maximum + ", average=" + average + "}";
    }
    
    
}
