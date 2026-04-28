/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author medac
 */
public class Animal {
    
    
   String nombre;
   int patas;
   boolean pelo;
   private int comida;
   
   public Animal() {
    nombre="sin nombre";
    patas=0;
    pelo=false;
    comida=0;
}
    
   public Animal(String nombre,int patas,boolean pelo){
       this.nombre=nombre;
       this.patas=patas;
       this.pelo=pelo;
       if (patas<4) {
           comida=10;
       }else{
           comida=20;
       }
   }
       public void comer (int alimento){
           if (comida==alimento) {
               System.out.println("animal esta satisfecho");
               
           }else if (alimento>comida) {
               System.out.println("lo esta sobrealimentando");
           }else{
               System.out.println("Tiene hambre");
           }
       }
       public int dimeComida(){
           
           return comida;
       }
       public void mostrar(){
                  System.out.println("Nombre: " + nombre + " patas: " + patas + " pelo: " + pelo + " comida: " + comida);

       }
   }
    
    
    

