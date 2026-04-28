/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discotec;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author medac
 */
public class Discotec {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int edad = 0;
    String nombre = null;
    boolean resp = true;
    int menu=0;
    File input=new File("imput.txt");
    File logs=new File("logs.txt");

    do {
        System.out.println("Menu");
        System.out.println("-------------------------------------");

        try {
            
            FileWriter fw=new FileWriter(input);
            BufferedWriter bw=new BufferedWriter(fw);
            
            FileWriter fw2=new FileWriter(logs);
            BufferedWriter bw2=new BufferedWriter(fw2);
            
            System.out.println("Que hacemos en la discotec");
            System.out.println("1.- Añadir persona  2.- Salir");
            switch(menu){
                case 1:
                    nombre = sc.next();

            System.out.println("Edad:");
            edad = sc.nextInt();

            

            System.out.println(nombre + " puede entrar a la discoteca");
            
            String texto=nombre+(char)edad;
            bw.write(texto);
            bw.close();
            break;
                case 2:
                    resp=false;
            
            }

      
        } catch (Exception e) {
            System.out.println("Error en los datos introducidos");
            sc.nextLine();
            
            
        }

    } while (resp);
    
}

public static void regristrarEdad(Persona persona){
    try{
        BufferedWriter bw=new BufferedWriter(new FileWriter("input.txt"));
        bw.write(persona.toString());
        bw.newLine();
        bw.close();
    }catch(IOException e){
        System.out.println("Error");
    }
}

public static void regristrarEdad(String mensaje){
    try{
        BufferedWriter bw=new BufferedWriter(new FileWriter("logs.txt"));
        bw.write(mensaje);
        bw.newLine();
        bw.close();
    }catch(IOException e){
        System.out.println("Error");
    }
}
   
}
