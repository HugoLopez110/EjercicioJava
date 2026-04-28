/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseherenciaanimal;

/**
 *
 * @author medac
 */
public abstract class Animal {
    protected int patas;
   
    
    public Animal(int patas){
    
    }
    public void dormir(){
        System.out.println("zzzzz");
    }
    public abstract void comer();

    @Override
    public String toString() {
        return super.toString();
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }
}
