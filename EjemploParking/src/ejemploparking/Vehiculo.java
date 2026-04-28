/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploparking;

/**
 *
 * @author medac
 */
public class Vehiculo {
    
   protected String matricula;
   protected char letra;
   
   public Vehiculo(String matricula){
       this.matricula=matricula;
       letra=' ';
   }

    @Override
    public String toString() {
        return " " + letra;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
