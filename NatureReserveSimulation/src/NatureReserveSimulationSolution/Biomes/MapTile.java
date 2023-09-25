/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Biomes;

import NatureReserveSimulationSolution.Animals.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erasmus1
 */
public class MapTile {
    private Biome biome;
    private int xCoordinate;
    private int yCoordinate;
    private List<Animal> animals;

    public MapTile(Biome biome, int xCoordinate, int yCoordinate) {
        this.biome = biome;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.animals = new ArrayList<>();
    }
}
