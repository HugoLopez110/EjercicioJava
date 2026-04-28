/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionbanco;

/**
 *
 * @author medac
 */
public class Cuenta {
    
    private String titular;
    private int numero;
    private double saldo;
    
    Cuenta(String titular,int numero, double saldo) throws SaldoInsuficienteException{
        if (saldo<0.0) {
            throw new SaldoInsuficienteException("Cuenta creada con valor negativo");
        }
        this.titular=titular;
        this.numero=numero;
        this.saldo=saldo;
    }
    
    public void movimiento(double valor) throws SaldoInsuficienteException{
        if (saldo+valor<0.0) {
            throw new SaldoInsuficienteException("Movimiento con valor negativo");
        }
        saldo=saldo+valor;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
}
