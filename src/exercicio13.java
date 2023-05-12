/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima 
somente o valor total da soma (utilize while).
* Data: 12/05/2023
*/

public class exercicio13 {
    public static void main(String[] args) {

        int soma = 0;
        int num = 1;

        while(num <= 100) {
            soma += num;
            num ++;
        }

        System.out.println(soma);

    }
}