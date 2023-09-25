/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Plants.PlantFactory;
import NatureReserveSimulationTest.UI.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 *
 * @author Daniele Perottoni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Scanner s = new Scanner(System.in);
        System.out.println("How many animals do you want in your nature reserve?");
        int numAnimals = s.nextInt();*/
        
        HashMap<String, Supplier<Animal>> animalMap = new HashMap<>();
        
        animalMap.put("lion", () -> new Lion());
        animalMap.put("snake", () -> new Snake());
        animalMap.put("zebra", () -> new Zebra());
        animalMap.put("mouse", () -> new Mouse());
        animalMap.put("bird", () -> new Bird());
        animalMap.put("frog", () -> new Frog());
        animalMap.put("fish", () -> new Fish());
        animalMap.put("insect", () -> new Insect());
        
        AnimalFactory animalFactory = new AnimalFactory(animalMap);
        PlantFactory plantFactory = new PlantFactory();
        UIService uiService = new ConsoleUIService();
        Simulation zooSofia = new Simulation(animalFactory, plantFactory, 5, 5, uiService);
        
        zooSofia.runSimulation();
    }

}
