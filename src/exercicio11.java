/* /* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa que imprima todos os números pares de 1 
a 100 na ordem inversa
* Data: 12/05/2023
*/

public class exercicio11 {
    public static void main(String[] args) {
        int i = 100;
        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
