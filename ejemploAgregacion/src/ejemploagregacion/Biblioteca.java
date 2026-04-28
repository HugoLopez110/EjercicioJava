/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploagregacion;

import java.util.Arrays;

/**
 *
 * @author medac
 */
public class Biblioteca {
    private String nombre;
    private Libro[] libros;
    
    Biblioteca(String nombre, Libro[] libros){
        this.nombre=nombre;
        this.libros=libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", libros=" + Arrays.toString(libros) + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public Libro[] getLibros() {
        return libros;
    }
}
