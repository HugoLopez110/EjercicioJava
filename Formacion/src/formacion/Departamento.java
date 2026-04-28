/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formacion;

/**
 *
 * @author medac*/


import java.util.Arrays;

public class Departamento {
    
    private String nombre;
    private Profesor [] profesores;

    public Departamento(String nombre, Profesor[] profesores) {
        this.nombre = nombre;
        this.profesores = profesores;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + Arrays.toString(profesores) + '}';
    }
}

