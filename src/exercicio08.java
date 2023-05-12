/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Crie um programa que lê um número entre 1 e 12, correspondendo 
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. 
Ao final, o programa deve imprimir uma mensagem identificando, 
com base no número digitado, o nome do mês e a estação.
Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
* Data: 16/04/2023
*/

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 12 de acordo com o mês do ano:");
        int mes = teclado.nextInt();

        if (mes == 1){
            System.out.println("Mês: Janeiro\nEstação: Verão");
        } else if (mes == 2){
            System.out.println("Mês: Fevereiro\nEstação: Verão");
        }
        if (mes == 3){
            System.out.println("Mês: Março\nEstação: Verão");
        } else if (mes == 4){
            System.out.println("Mês: Abril\nEstação: Verão");
        }
        if (mes == 5){
            System.out.println("Mês: Maio\nEstação: Inverno");
        } else if (mes == 6){
            System.out.println("Mês: Junho\nEstação: Outono");
        }
        if (mes == 7){
            System.out.println("Mês: Julho\nEstação: Inverno");
        } else if (mes == 8){
            System.out.println("Mês: Agosto\nEstação: Inverno");
        }
        if (mes == 9){
            System.out.println("Mês: Setembro\nEstação: Inverno");
        } else if (mes == 10){
            System.out.println("Mês: Outubro\nEstação: Primavera");
        }
        if (mes == 9){
            System.out.println("Mês: Novembro\nEstação: Primavera");
        } else if (mes == 12){
            System.out.println("Mês: Dezembro\nEstação: Verão");
        }
        teclado.close();
    }
}
