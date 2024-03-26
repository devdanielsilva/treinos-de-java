
package com.mycompany.banco;

public class Operacoes {
    boolean saque;
    boolean deposito;
    float saldo;
    void status(){
        System.out.println("Saque " + this.saque);
        System.out.println("Deposito " + this.deposito);
        System.out.println("Saldo " + this.saldo);
    }
}
