/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author medac
 */
public class Granjero {
    String nombre;
    private int fuerza;
    int iq;
    
    public Granjero(String nombre){
        this.nombre=nombre;
        fuerza=(int) (Math.random()*4);
        iq=(int) (Math.random()*2);
    }
    
    public int darComida(){
        int comida=(fuerza + iq)+5;
        return comida;
    }
    public int dimefuerza(){
        return fuerza;
    }
    public void mostrar(){
        System.out.println("Nombre: " + nombre + " fuerza: " + fuerza + " IQ: " + iq);
    }
    
    
}
