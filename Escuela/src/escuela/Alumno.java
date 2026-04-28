/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Alumno {
    private boolean notaIntroducida;

    
    
    private String nombre;
    private int nif;
    private int [] notas;

    public Alumno(String nombre, int nif) {
        this.nombre = nombre;
        this.nif = nif;
        notas=new int[5];
        
    }

    public void setNotas(int nota1, int nota2, int nota3, int nota4, int nota5) {
        notas[0]=nota1;
        notas[1]=nota2;
        notas[2]=nota3;
        notas[3]=nota4;
        notas[4]=nota5;
        notaIntroducida=true;
    }

    public void setNotaIntroducida(boolean notaIntroducida) {
        this.notaIntroducida = notaIntroducida;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nif=" + nif + ", notas=" + Arrays.toString(notas) + '}';
    }

    public String getNotas() {
        return Arrays.toString(notas);
    }

    public String getNombre() {
        return nombre;
    }
    
    public void notaMedia(){
        double cont=0.0;
        for (int i = 0; i < notas.length; i++) {
            cont=cont + notas[i];
        }
        System.out.println("La media es: " + cont/5);
    }
    
    

    public boolean isNotaIntroducida() {
        return notaIntroducida;
    }
}
