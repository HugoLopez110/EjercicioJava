/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciastarwars;

/**
 *
 * @author medac
 */
public class Dark_Vader {
   protected boolean lado_oscuro;
   protected int habilidad_pilotar;
   protected int habilidad_espadaLaser;
   protected int habilidad_poderFuerza;
   
   public Dark_Vader(){
       lado_oscuro=true;
       habilidad_pilotar=5;
       habilidad_espadaLaser=4;
       habilidad_poderFuerza=4;
   }

    @Override
    public String toString() {
        return "Dark_Vader{" + "lado_oscuro=" + lado_oscuro + ", habilidad_pilotar=" + habilidad_pilotar + ", habilidad_espadaLaser=" + habilidad_espadaLaser + ", habilidad_poderFuerza=" + habilidad_poderFuerza + '}';
    }

    public boolean isLado_oscuro() {
        return lado_oscuro;
    }

    public void setLado_oscuro(boolean lado_oscuro) {
        this.lado_oscuro = lado_oscuro;
    }

    public int getHabilidad_pilotar() {
        return habilidad_pilotar;
    }

    public void setHabilidad_pilotar(int habilidad_pilotar) {
        this.habilidad_pilotar = habilidad_pilotar;
    }

    public int getHabilidad_espadaLaser() {
        return habilidad_espadaLaser;
    }

    public void setHabilidad_espadaLaser(int habilidad_espadaLaser) {
        this.habilidad_espadaLaser = habilidad_espadaLaser;
    }

    public int getHabilidad_poderFuerza() {
        return habilidad_poderFuerza;
    }

    public void setHabilidad_poderFuerza(int habilidad_poderFuerza) {
        this.habilidad_poderFuerza = habilidad_poderFuerza;
    }
   
   public void Hablar(){
       System.out.println("Yo soy tu padre");
   }
   
}
