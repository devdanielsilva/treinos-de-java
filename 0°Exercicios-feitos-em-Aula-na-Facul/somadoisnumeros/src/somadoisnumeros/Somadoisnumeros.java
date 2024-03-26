
package somadoisnumeros;
import java.util.Scanner; /*Comando para importação de entrada de dados (ex: teclado, leitor de códigos de barra, microfone...), 
vai sempre abaixo do pacote, para que classe possa importa. */
public class Somadoisnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int numero1 = 10;
        //int numero2 = 5;
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        scanner.close();
        int resultadoSoma = somarNumeros(numero1, numero2);
         /*Para exibir o resultado, tem que no programa em que for ter os números. Faz parte da lógica do primeiro programa.*/
        System.out.println("A soma de" + numero1 + "e" + numero2 + "é:" + resultadoSoma);
    }
     /*Agora para retornar o resultado da soma da função, criamos outro outra classe, privada por sua vez. */
    private static int somarNumeros(int num1, int num2){
        return num1 + num2; /*return vai retornar o resultado da função somarNumeros*/
    }
}
