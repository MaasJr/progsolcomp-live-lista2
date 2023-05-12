/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Construa um programa que receba como entrada três valores A, B 
e C e os imprima em ordem crescente.
* Data: 16/04/2023
*/
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o segundo valor");
        double num2 = teclado.nextDouble();

        System.out.println("Digite o último valor");
        double num3 = teclado.nextDouble();

        System.out.println("Números em ordem crescente:");

        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 + ", " + num2 + ", " + num3);
        } else if (num1 > num3 && num3 > num2) {
            System.out.println(num1 + ", " + num3 + ", " + num2);
        }

        if (num2 > num1 && num1 > num3) {
            System.out.println(num2 + ", " + num1 + ", " + num3);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println(num2 + ", " + num3 + ", " + num1);
        }

        if (num3 > num1 && num1 > num2) {
            System.out.println(num3 + ", " + num1 + ", " + num2);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println(num3 + ", " + num2 + ", " + num1);
        }
        teclado.close();
    }
}
