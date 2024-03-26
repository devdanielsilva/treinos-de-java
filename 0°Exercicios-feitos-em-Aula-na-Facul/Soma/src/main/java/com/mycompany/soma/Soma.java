/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma;
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
 
        // Solicita e lê as três notas
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
 
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
 
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
 
        // Fecha o Scanner após a leitura das notas
        scanner.close();
 
        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;
 
        // Exibe a média das notas
        System.out.println("A média das notas é: " + media);   
    }
}

 

