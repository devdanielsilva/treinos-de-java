
package com.mycompany.banco;

public class Banco {

    public static void main(String[] args) {
       Operacoes b1 = new Operacoes();
       b1.saque = false;
       b1.deposito = true;
       b1.saldo = 300f;
       b1.status();
    }
}
