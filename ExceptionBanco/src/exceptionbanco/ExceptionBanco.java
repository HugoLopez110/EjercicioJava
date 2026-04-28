/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionbanco;

import java.util.*;

/**
 *
 * @author medac
 */
public class ExceptionBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        try{
        System.out.println("Introduce nombre");
        String titular= sc.next();
        System.out.println("Introudce num");
        int numero=sc.nextInt();
        Cuenta c=new Cuenta(titular,numero,500);
         c.movimiento(-109700);
            }catch(SaldoInsuficienteException e){
                System.out.println(e.getMessage());
                
            }catch(InputMismatchException e){
                System.out.println("Error por datos incorrectos");
            }catch(Exception e){
                System.out.println("Error general");
            }
    }
    
}
