/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseherenciaanimal;

/**
 *
 * @author medac
 */
public class Perro extends Animal {

    public Perro(int patas) {
        super(patas);
    }

    @Override
    public void comer() {
        System.out.println("come pienso");  
    }
    
}
