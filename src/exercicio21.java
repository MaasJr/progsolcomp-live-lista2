/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Escreva um programa que, dado um número positivo digitado 
pelo o usuário mostre a tabuada de todos os números de 1 até o 
número digitado. (utilize for)
* Data: 11/05/2023
*/

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número positivo");
        int num = sc.nextInt();

        System.out.println("TABUADA DE ADIÇÃO");

        for (int i = 1; i <= num; i++) {
            int a = i - 1;
            System.out.println(a + " + " + "1 " + "= " + i);
        }

        System.out.println("TABUADA DE MULTIPLICAÇÃO");
    
        for (int j = 1; j <= num; j++) {
            int i = 1;
            System.out.println(i + " x " + j + " = " + (i*j));
        }

        System.out.println("TABUADA DE SUBTRAÇÃO");

        for (int i = 1; i <= num; i++) {
            int a = 1;
            System.out.println(i + " - " + a + " = " + (i-a));
        }

        System.out.println("TABUADA DE DIVISÃO");

        for (int i = 1; i <= num; i++) {
            int a = 1;
            System.out.println(i + " / " + a + " = " + (i/a));
        }
        sc.close();
    }
}
