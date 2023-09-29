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
    
    public List<MapTile> getAdjacentTiles(MapTile[][] mapGrid) {
        List<MapTile> adjacentTiles = new ArrayList<>();

        int width = mapGrid.length;
        int height = mapGrid[0].length;

        if (isValid(xCoordinate - 1, yCoordinate, width, height)) {
            adjacentTiles.add(mapGrid[xCoordinate - 1][yCoordinate]);
        }
        if (isValid(xCoordinate + 1, yCoordinate, width, height)) {
            adjacentTiles.add(mapGrid[xCoordinate + 1][yCoordinate]);
        }
        if (isValid(xCoordinate, yCoordinate - 1, width, height)) {
            adjacentTiles.add(mapGrid[xCoordinate][yCoordinate - 1]);
        }
        if (isValid(xCoordinate, yCoordinate + 1, width, height)) {
            adjacentTiles.add(mapGrid[xCoordinate][yCoordinate + 1]);
        }

        return adjacentTiles;
    }

    private boolean isValid(int x, int y, int width, int height) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
