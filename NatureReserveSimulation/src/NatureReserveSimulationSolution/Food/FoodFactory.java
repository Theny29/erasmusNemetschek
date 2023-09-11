/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Food;

import java.util.ArrayList;

/**
 *
 * @author Daniele Perottoni
 */
public class FoodFactory {

    private static final ArrayList<Food> food = new ArrayList<>();

    public static ArrayList<Food> crateFood() {
        Food meat = new Food(FoodRegister.Meat, 10);
        Food fish = new Food(FoodRegister.Fish, 10);
        Food plankton = new Food(FoodRegister.Plankton, 10);
        Food berry = new Food(FoodRegister.Berry, 8);
        Food insect = new Food(FoodRegister.Insect, 8);
        Food mouse = new Food(FoodRegister.Mouse, 5);
        Food snake = new Food(FoodRegister.Snake, 5);
        Food bird = new Food(FoodRegister.Bird, 5);
        Food squid = new Food(FoodRegister.Squid, 5);
        Food leaf = new Food(FoodRegister.Leaf, 5);
        Food flower = new Food(FoodRegister.Flower, 5);
        Food crustacean = new Food(FoodRegister.Crustacean, 5);
        Food seaGrass = new Food(FoodRegister.seaGrass, 5);
        Food worms = new Food(FoodRegister.Worms, 5);
        Food grass = new Food(FoodRegister.Grass, 3);

        food.add(meat);
        food.add(leaf);
        food.add(grass);
        food.add(flower);
        food.add(mouse);
        food.add(bird);
        food.add(insect);
        food.add(berry);
        food.add(plankton);
        food.add(fish);
        food.add(squid);
        food.add(snake);
        food.add(seaGrass);
        food.add(worms);
        food.add(crustacean);
        
        return food;
    }

}
