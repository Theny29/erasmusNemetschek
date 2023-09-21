/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationTest.UI;

import NatureReserveSimulationSolution.Animals.Animal;
import java.util.ArrayList;

/**
 *
 * @author Erasmus1
 */
public class ConsoleUIService implements UIService {
    @Override
    public void displaySummary(int turn, int aliveCount, int deadCount) {
        System.out.println("Year: " + turn);
        System.out.println("Alive Animals: " + aliveCount);
        System.out.println("Dead Animals: " + deadCount);
    }

    @Override
    public void displayDetails(ArrayList<Animal> livingAnimals) {
        System.out.println("Animal Details:");
        for (Animal animal : livingAnimals) {
            System.out.println(animal.getName() + (animal.isIsAlive() ? " is Alive" : " is Dead"));
        }
    }
}
