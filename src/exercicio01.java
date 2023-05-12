/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior 
deles.
* Data: 16/04/2023
*/

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = teclado.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número digitado é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número digitado é: " + num2);
        }
teclado.close();
    }
}
