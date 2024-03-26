
package mediadetresnotas;
import java.util.Scanner;
public class Mediadetresnotas {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Digite a primeira nota: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite a terceira nota: ");
        int numero3 = scanner.nextInt();
        scanner.close();
        int resultadoSoma = Mediadetresnotas(numero1, numero2, numero3);
        
        System.out.println("A soma de" + numero1 + numero2 + numero3 "é:" + resultadoSoma);
    }
    private static int somarNumeros(int num1, int num2, int num3){
        return num1 + num2 + num3; /*return vai retornar o resultado da função somarNumeros*/
    }
    
}
