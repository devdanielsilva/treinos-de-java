
package com.mycompany.app_comida;

public class App_comida {

    public static void main(String[] args) {
          Entrega e1 = new Entrega();
       e1.pedido = true;
       e1.distancia = 5f;
       e1.frete = 15f;
       e1.status();
    }
}
