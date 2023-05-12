/* Nome do Aluno: Marcelo Augusto Alves da Silva Júnior
* RA: 12723130072
* Faça um programa que imprima os múltiplos negativos de 7, 
superiores a -1000. (utilize do / while)
* Data: 11/05/2023
*/

public class exercicio17 {
    public static void main(String[] args) throws Exception {
        int numero = -7;
        
        while (numero > -1000) {
            System.out.println(numero);
            numero = numero - 7;
        }
    }
}