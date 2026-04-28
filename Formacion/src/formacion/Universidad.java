/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formacion;

import java.util.Arrays;

/**
 *
 * @author medac
 */
public class Universidad {
    private String nombre;
    private Departamento [] departamentos;
    static int pos=0;
    
    public Universidad(String nombre){
        this.nombre=nombre;
        departamentos=new Departamento [5];
    }
    public void agregarDepartamento (String nombre, Profesor [] profesores){
        if (pos<5) {
          departamentos [pos]= new Departamento(nombre,profesores);
        pos++;  
        }
        
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", departamentos=" + Arrays.toString(departamentos) + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public static void setPos(int pos) {
        Universidad.pos = pos;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public static int getPos() {
        return pos;
    }
    
}
