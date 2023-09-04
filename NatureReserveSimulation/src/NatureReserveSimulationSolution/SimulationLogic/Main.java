/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Animals.AnimalsRegister;
import NatureReserveSimulationSolution.Food.Food;
import NatureReserveSimulationSolution.Food.FoodRegister;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Daniele Perottoni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        
        Food meat = new Food(FoodRegister.Meat, 20);
        Food leaf = new Food(FoodRegister.Leaf, 10);
        Food grass = new Food(FoodRegister.Grass, 5);
        Food flower = new Food(FoodRegister.Flower, 5);
        Food mouse = new Food(FoodRegister.Mouse, 15);
        Food bird = new Food(FoodRegister.Bird, 15);
        Food insect = new Food(FoodRegister.Insect, 10);
        Food berry = new Food(FoodRegister.Berry, 10);
        Food plankton = new Food(FoodRegister.Plankton, 5);
        Food fish = new Food(FoodRegister.Fish, 15);
        Food squid = new Food(FoodRegister.Squid, 20);
        Food snake = new Food(FoodRegister.Snake, 15);

    }

}
