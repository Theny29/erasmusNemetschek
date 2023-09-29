/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Biomes;

import java.util.Random;

/**
 *
 * @author Erasmus1
 */
public class Map {

    private MapTile[][] mapGrid;

    public Map(int width, int height) {
        mapGrid = new MapTile[width][height];
        initializeMapWithRandomBiomes();
    }

    private void initializeMapWithRandomBiomes() {
        for (int x = 0; x < mapGrid.length; x++) {
            for (int y = 0; y < mapGrid[0].length; y++) {
                Biome randomBiome = getRandomBiome();
                mapGrid[x][y] = new MapTile(randomBiome, x, y);
            }
        }
    }

    private Biome getRandomBiome() {
        Random random = new Random();
        int biomeType = random.nextInt(3);
        Biome biome;
        switch (biomeType) {
            case 0:
                biome = new Plain();
                break;
            case 1:
                biome = new Forest();
                break;
            case 2:
                biome = new Savannah();
                break;
            case 3:
                biome = new Sea();
                break;
            default:
                biome = new Plain();
        }
        return biome;
    }
    
}
