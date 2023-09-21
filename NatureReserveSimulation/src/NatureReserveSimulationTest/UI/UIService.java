/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package NatureReserveSimulationTest.UI;

import NatureReserveSimulationSolution.Animals.Animal;
import java.util.ArrayList;

/**
 *
 * @author Erasmus1
 */
public interface UIService {
    void displaySummary(int turn, int aliveCount, int deadCount);
    void displayDetails(ArrayList<Animal> animals);
}
