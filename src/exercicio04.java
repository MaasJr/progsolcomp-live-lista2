/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa que leia um número inteiro e mostre uma 
mensagem indicando se este número é par ou ímpar e se é 
positivo ou negativo.
* Data: 16/04/2023
*/

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numScan = teclado.nextInt();

/* Consideramos um número como sendo par quando o dividimos por dois e seu resto é zero. Já um número é 
ímpar quando, na divisão por dois, o resto é diferente de zero. */

        int restoPar = numScan % 2;
        int restoImpar = numScan % 2;

        if (restoPar == 0){
            System.out.print("O número é par");
        } else if (restoImpar != 0) {
            System.out.print("O número é ímpar");
        }

        /*Ao se multiplicar dois números de sinais opostos o resultado será negativo. Ao se dividir dois 
        números com mesmo sinal o resultado será positivo; Ao se dividir dois números de sinais opostos 
        o resultado será negativo. */

        int numPos = numScan * 2;
        int numNeg = numScan * -2;

        if (numPos > 0){
            System.out.print(" e positivo.");
        } else if (numNeg < 0) {
            System.out.print(" e negativo.");
        }
        teclado.close();
    }
}
