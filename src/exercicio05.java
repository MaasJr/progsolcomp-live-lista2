/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa que leia o nome, o sobrenome, a idade, em 
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja 
visualizar dados completos?”. Se o caractere digitado pelo 
usuário for ‘S’ o programa deve imprimir na tela Nome, 
Sobrenome, idade e naturalidade. Se o caractere digitado pelo 
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se 
o caractere não for nenhuma das outras opções acima o programa 
deve imprimir “Digitação errada. Tente Novamente”.
* Data: 16/04/2023
*/

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = teclado.nextLine();

        System.out.println("Digite sua idade em anos (YY):");
        int idade = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Digite a cidade em que você nasceu:");
        String cidade = teclado.nextLine();

        System.out.println("Deseja visualizar dados completos (S/N)?");
        String resposta = teclado.nextLine();

        if (resposta.equals("S")) {
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade: " + cidade);
        } else if (resposta.equals("N")) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
        teclado.close();
    }
}
