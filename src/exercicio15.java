/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Nome do Programa: Faça um programa que preencha com zeros todas as posições 
de uma matriz com 10 linha e 10 colunas
* Data: 12/05/2023
*/

public class exercicio15 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 0;
            }
        }

        // Exemplo de impressão da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
