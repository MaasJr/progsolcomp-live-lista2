/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa:  Faça um programa que receba o valor da venda, escolha a 
condição de pagamento no menu e mostre o total da venda final 
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
* Data: 16/04/2023
*/

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da venda");
        double venda = teclado.nextDouble();

        System.out.println("Escolha a forma de pagamento:\nA Vista - 1\nA Prazo 30 dias - 2\nA Prazo 60 dias - 3\nA Prazo 90 dias - 4\nCartão de débito - 5\nCartão de crédito - 6");
        int formaDePagamento = teclado.nextInt();

        if (formaDePagamento == 1){
            double desconto = venda * 0.10;
            double valorFinal = venda - desconto;
            System.out.println("O valor com desconto é: " + valorFinal);
        } else if (formaDePagamento == 2){
            double desconto = venda * 0.05;
            double valorFinal = venda - desconto;
            System.out.println("O valor com desconto é: " + valorFinal);
        }
        if (formaDePagamento == 3){
            System.out.println("Essa forma de pagamento não tem desconto, ficando: " + venda);
        } else if (formaDePagamento == 4){
            double desconto = venda + 0.05;
            double valorFinal = venda + desconto;
            System.out.println("O valor com acréscimo é: " + valorFinal);
        }
        if (formaDePagamento == 5){
            double desconto = venda * 0.08;
            double valorFinal = venda - desconto;
            System.out.println("O valor com desconto é: " + valorFinal);
        } else if (formaDePagamento == 6){
            double desconto = venda * 0.07;
            double valorFinal = venda - desconto;
            System.out.println("O valor com desconto é: " + valorFinal);
        }
        teclado.close();
    }
}
