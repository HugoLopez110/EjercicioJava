/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formacion;

/**
 *
 * @author medac
 */
public class Profesor {
    private String nombre;
    static int id_empleado;
    private int id;
    
    public Profesor(String nombre){
        this.nombre=nombre;
        id_empleado++;
        id=id_empleado;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", id=" + id + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setId_empleado(int id_empleado) {
        Profesor.id_empleado = id_empleado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getId_empleado() {
        return id_empleado;
    }

    public int getId() {
        return id;
    }
}
