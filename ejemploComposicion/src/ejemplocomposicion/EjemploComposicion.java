/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocomposicion;

/**
 *
 * @author medac
 */
public class EjemploComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Humano h= new Humano("Gonzalo");
        System.out.println(h);
        System.out.println(h.getCorazon());
        h=null;
        System.out.println(h.getCorazon());
    }
    
}
