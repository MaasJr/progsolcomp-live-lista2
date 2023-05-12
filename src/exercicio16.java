/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa que solicite ao usuário que digite um 
número até que ele digite um número menor que 0 (utilize 
while)
* Data: 12/05/2023
*/

import java.util.Scanner;;

public class exercicio16 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        int numero = 0;
        while (numero >= 0) {
            System.out.print("Digite um número negativo para fechar o programa: ");
            numero = teclado.nextInt();
        }
        
        System.out.println("O programa foi encerrado.");
        
        teclado.close();
    }
}