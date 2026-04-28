/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocomposicion;

/**
 *
 * @author medac
 */
public class Humano {
    private String nombre;
    private Corazon corazon;
    
    public Humano(String nombre){
        this.nombre=nombre;
        corazon=new Corazon();
    }

    @Override
    public String toString() {
        return "Humano{" + "nombre=" + nombre + ", corazon=" + corazon + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public String getNombre() {
        return nombre;
    }

    public Corazon getCorazon() {
        return corazon;
    }
}
