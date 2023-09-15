/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Plants;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Daniele Perottoni
 */
public class PlantFactory {

    private ArrayList<Plant> plants;

    public PlantFactory() {
        this.plants = new ArrayList<>();
    }

    public ArrayList<Plant> createRandomPlants(int numPlants) {
        Random random = new Random();
        for (int i = 0; i < numPlants; i++) {
            int foodType = random.nextInt(3);
            Plant plant;
            switch(foodType) {
                case 0:
                    plant = new Fruit();
                    break;
                case 1:
                    plant = new Grass();
                    break;
                case 2:
                    plant = new Leaf();
                    break;
                default:
                    plant = new Fruit();
            }
            plants.add(plant);
        }
        return plants;
    }

}
