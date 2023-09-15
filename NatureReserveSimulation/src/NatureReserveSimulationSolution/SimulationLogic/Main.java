/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NatureReserveSimulationSolution.SimulationLogic;

import NatureReserveSimulationSolution.Animals.*;
import NatureReserveSimulationSolution.Plants.Plant;
import NatureReserveSimulationSolution.Plants.PlantFactory;
import java.util.ArrayList;
import java.util.Scanner;

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
        
        AnimalFactory animalFactory = new AnimalFactory();
        PlantFactory plantFactory = new PlantFactory();
        Simulation zooSofia = new Simulation(animalFactory, plantFactory, 5, 5);
        
        zooSofia.runSimulation();
    }

}
