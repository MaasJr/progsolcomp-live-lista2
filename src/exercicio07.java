/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa calcula o total de uma hospedagem em um 
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.

* Data: 16/04/2023
*/

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) throws Exception {
        int valorDiaria = 60;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade total de diárias:");
        int diaria = teclado.nextInt();

        if (diaria > 15){
            double diariaServico = diaria * 5.5;
            double diariaValor = diaria * valorDiaria;
            double diariaFinal = diariaServico + diariaValor;
            System.out.println("O valor total da hospedagem é: " + diariaFinal);
        } else if (diaria == 15){
            int diariaServico = diaria * 6;
            int diariaValor = diaria * valorDiaria;
            int diariaFinal = diariaServico + diariaValor;
            System.out.println("O valor total da hospedagem é: " + diariaFinal);
        }
        if (diaria < 15){
            int diariaServico = diaria * 8;
            int diariaValor = diaria * valorDiaria;
            int diariaFinal = diariaServico + diariaValor;
            System.out.println("O valor total da hospedagem é: " + diariaFinal);
        }
            teclado.close();
    }
}
