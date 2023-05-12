/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Um determinado gás duplica seu volume a cada segundo. 
Dada um volume inicial, em centímetros cúbicos, digitado pelo 
usuário faça um programa que determine o tempo necessário para 
que esse volume se torne maior que 1000 centímetros cúbicos. 
(utilize while)
* Data: 12/05/2023
*/


import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o volume inicial em cm³: ");
        int volumeInicial = teclado.nextInt();
        
        int tempo = 0;
        int volumeAtual = volumeInicial;
        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            tempo++;
        }
        
        System.out.println("O volume ultrapassou 1000 cm³ após " + tempo + " segundos.");
        
        teclado.close();
    }
}
