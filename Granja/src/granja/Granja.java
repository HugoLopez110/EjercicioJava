/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

/**
 *
 * @author medac
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int comida1,comida2;
        
        Animal g1= new Animal("Gallina",2,false);
        Animal g2= new Animal("Gallina",2,false);
        Animal g3= new Animal("Gallina",2,false);
        Animal g4= new Animal("Gallina",2,false);
        
        Animal p1=new Animal("Perro",4,true);
        Animal p2=new Animal("Perro",4,true);
        Animal p3=new Animal("Perro",4,true);
        Animal p4=new Animal("Perro",4,true);
        
        Animal c1=new Animal("Cerdo",4,true);
        Animal c2=new Animal("Cerdo",4,true);
        
        Granjero h1=new Granjero("Granjero1");
        Granjero h2=new Granjero("Granjero2");
        
        do {
            System.out.println(g1.dimeComida());
            System.out.println(g2.dimeComida());
            System.out.println(g3.dimeComida());
            System.out.println(g4.dimeComida());
            
            System.out.println(p1.dimeComida());
            System.out.println(p2.dimeComida());
            System.out.println(p3.dimeComida());
            System.out.println(p4.dimeComida());
            
            System.out.println(c1.dimeComida());
            System.out.println(c2.dimeComida());
            
            comida1=h1.darComida();
            comida2=h2.darComida();
            
            g1.comer(comida1);
            g2.comer(comida1);
            g3.comer(comida1);
            g4.comer(comida1);
            
            p1.comer(comida2);
            p2.comer(comida2);
            p3.comer(comida2);
            p4.comer(comida2);
            
            c1.comer(comida2);
            c2.comer(comida2);
            
            
        } while (siAlimento(g1,g2,g3,g4,p1,p2,p3,p4,c1,c2));

        
        
    }

    private static boolean siAlimento(Animal g1, Animal g2, Animal g3, Animal g4, Animal p1, Animal p2, Animal p3, Animal p4, Animal c1, Animal c2) {
    
        if (g1.dimeComida()==0 && g2.dimeComida()==0 && g3.dimeComida()==0 && g4.dimeComida()==0 && p1.dimeComida()==0 && p2.dimeComida()==0 && p3.dimeComida()==0 && p4.dimeComida()==0 && c1.dimeComida()==0 && c2.dimeComida()==0  ) {
            return true;
        }else{ 
        return false;
    }}


    
}
