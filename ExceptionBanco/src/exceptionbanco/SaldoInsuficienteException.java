/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionbanco;

/**
 *
 * @author medac
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(){
        super();
    }
    
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    
    }
    
}
