/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NatureReserveSimulationSolution.Animals;

/**
 *
 * @author Erasmus1
 */
public class Lion extends Animal{
    
    public Lion() {
        super(AnimalsRegister.Lion, 150, 20, "GRRR");
        diet.add(AnimalsRegister.Zebra.toString());
        diet.add(AnimalsRegister.Snake.toString());
    }
    
    @Override
    public void addFood() {
        diet.add(AnimalsRegister.Mouse.toString());
    }
    
    
}
