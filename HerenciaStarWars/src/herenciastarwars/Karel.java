/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciastarwars;

/**
 *
 * @author medac
 */
public class Karel extends Leia{
    
    public Karel(){
        super(true);
        diplomacia = 3;
    }

    @Override
    public void Hablar() {
        System.out.println("Soy tu nieto");    }
    
}
