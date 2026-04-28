/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploagregacion;

/**
 *
 * @author medac
 */
public class EjemploAgregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Libro l1=new Libro("hobbit",123);
    Libro l2=new Libro("principito",345);
    Libro [] libros={l1,l2};
    Biblioteca b1=new Biblioteca ("Biblio", libros);
        System.out.println(b1);
        b1=null;
        System.out.println(b1);
    }
    
}
