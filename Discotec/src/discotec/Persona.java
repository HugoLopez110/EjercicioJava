/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discotec;

/**
 *
 * @author medac
 */
public class Persona {
    String nombre;
    int edad=0;
    
    public Persona(String nombre,int edad) throws miException{
        this.nombre=nombre;
    if (edad < 18) {
                throw new miException("Acceso denegado: menor de edad");
                
            }
    this.edad=edad;
}

    @Override
    public String toString() {
        return nombre + ":" + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
