/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocomposicion;

/**
 *
 * @author medac
 */
public class Corazon {
  private int latidos;
private boolean salud;

public Corazon(){
    latidos=90;
    salud=true;
}

    @Override
    public String toString() {
        return "Corazon{" + "latidos=" + latidos + ", salud=" + salud + '}';
    }

    public void setLatidos(int latidos) {
        this.latidos = latidos;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public int getLatidos() {
        return latidos;
    }

    public boolean isSalud() {
        return salud;
    }
}
