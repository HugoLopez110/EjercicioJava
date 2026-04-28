/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploagregacion;

/**
 *
 * @author medac
 */
public class Libro {
    private String nombre;
    private int isbn;
    
    Libro(String nombre , int isbn){
        this.nombre=nombre;
        this.isbn=isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", isbn=" + isbn + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIsbn() {
        return isbn;
    }
}
