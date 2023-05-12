/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa para imprimir o conceito de um aluno. O 
conceito é calculado em função da nota do aluno que varia de 0 
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
* Data: 16/04/2023
*/

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        int nota = teclado.nextInt();

        if (nota > 0 && nota < 49) {
            System.out.println("Conceito = insuficiente");
        } else if (nota > 50 && nota < 64){
            System.out.println("Conceito = Regular");
        }
        if (nota > 65 && nota < 84){
            System.out.println("Conceito = Bom");
        } else if (nota > 85 && nota < 100){
            System.out.println("Conceito = ótimo");
        }
        teclado.close();   
    }
}
