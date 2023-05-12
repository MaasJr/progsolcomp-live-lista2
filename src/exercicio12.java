/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Faça um programa que exiba todos os números pares a 
partir de 0 até que encontre um múltiplo de 7 (utilize 
do/while)
* Data: 11/05/2023
*/

public class exercicio12 {
    public static void main(String[] args) {
        int numero = 0;
        
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            
            numero += 2;
        } while (numero % 7 != 0);
    }
}