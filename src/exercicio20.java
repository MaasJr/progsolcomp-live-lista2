/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Escreva um programa que, dada a carga máxima de um 
elevador e a quantidade máxima de pessoas digitadas pelo 
usuário, leia o peso de cada pessoa, também digitada pelo 
usuário, que entra no elevador até que a carga máxima seja 
atingida ou o número máximo de pessoas seja atingido (utilize 
do /while).
* Data: 12/05/2023
*/

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a carga máxima do elevador (em kg): ");
        int cargaMaxima = teclado.nextInt();
        
        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaximaPessoas = teclado.nextInt();
        
        int pesoAtual = 0;
        int quantidadePessoas = 0;
        do {
            System.out.print("Digite o peso da " + (quantidadePessoas+1) + "ª pessoa (em kg): ");
            int pesoPessoa = teclado.nextInt();
            if (pesoAtual + pesoPessoa > cargaMaxima) {
                System.out.println("Carga máxima do elevador atingida!");
                break;
            } else {
                pesoAtual += pesoPessoa;
                quantidadePessoas++;
            }
        } while (quantidadePessoas < quantidadeMaximaPessoas);
        
        System.out.println("O elevador está com " + quantidadePessoas + " pessoas, pesando um total de " + pesoAtual + " kg.");
        
        teclado.close();
    }
}