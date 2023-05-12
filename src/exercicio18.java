/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Faça um programa que determine o fatorial de um número. 
Para este problema, tem-se como entrada o valor do número do 
qual se deseja calcular o fatorial. O fatorial de 0 é igual a 
1. O fatorial de um número N (N!) é definido conforme a seguir 
(utilize for)
* Data: 12/05/2023
*/

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = teclado.nextInt();
        
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        
        teclado.close();
    }
}
