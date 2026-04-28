/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciastarwars;

/**
 *
 * @author medac
 */
public class HerenciaStarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Dark_Vader d1 = new Dark_Vader();
    Luke l1=new Luke();
    Leia l2=new Leia();
    Karel k1= new Karel();
    d1.Hablar();
    l1.Hablar();
    l2.Hablar();
    k1.Hablar();
        
    Dark_Vader [] jedis={d1,l1,l2,k1};
        for (int i = 0; i < jedis.length; i++) {
            System.out.println(jedis[i]);
        }
        jedis[0].Hablar();
        jedis[1].Hablar();
        Leia l5=(Leia) jedis[2];
        System.out.println(l5.getDiplomacia());
    }
    
}
