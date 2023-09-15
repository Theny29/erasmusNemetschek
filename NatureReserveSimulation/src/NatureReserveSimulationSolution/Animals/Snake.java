/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

/**
 *
 * @author Erasmus1
 */
public class Snake extends Animal{
    
    public Snake() {
        super(AnimalsRegister.Snake, 162, 70, "STRIKGNAK");
        diet.add(AnimalsRegister.Mouse.toString());
        diet.add(AnimalsRegister.Bird.toString());
    }
    
    @Override
    public void addFood() {
        diet.add(AnimalsRegister.Frog.toString());
    }
       
}
