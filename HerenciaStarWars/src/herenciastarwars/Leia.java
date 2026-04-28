/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciastarwars;

/**
 *
 * @author medac
 */
public class Leia extends Dark_Vader{
    protected int diplomacia;
    public Leia(){
        lado_oscuro=false;
        habilidad_pilotar=3;
        habilidad_espadaLaser=1;
        habilidad_poderFuerza=3;
        diplomacia=5;
    }
    
    public Leia(boolean lado){
        
    }

    public void setDiplomacia(int diplomacia) {
        this.diplomacia = diplomacia;
    }

    public int getDiplomacia() {
        return diplomacia;
    }

    public final void volar(){
        System.out.println("Volar en el espacio");
    }
    
    @Override
    public void Hablar() {
        System.out.println("Soy tu hija");    }

    @Override
    public String toString() {
        return super.toString() + "diplomacia: " + diplomacia;
    }
    
}
