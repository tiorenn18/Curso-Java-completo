package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_Estrutura_While_3 {
    public static void main(String[] args) {

    /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
    um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
    4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
    que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
    mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
    exemplo. */

        Scanner sc = new Scanner(System.in);
        int x, alcool,gasolina,diesel;
        alcool = 0; gasolina = 0; diesel = 0;

        System.out.println("--- Opções");
        System.out.println("--------------");
        System.out.println("1 - Álcool.");
        System.out.println("2 - Gasolina.");
        System.out.println("3 - Diesel.");
        System.out.println("4 - Fim.");
        System.out.println("--------------");


        x = sc.nextInt();

        while (x != 4) {
            if (x == 1) {
                alcool += 1;
            }
            else if (x == 2) {
                gasolina += 1;
            }
            else if (x == 3) {
                diesel += 1;
            }
            else {
                System.out.println("Valor inbvalido !Digite um valor entre 1 e 4!");
                x = sc.nextInt();
            }

            x = sc.nextInt();
        }

        System.out.println(" ----------------- muito obrigado! ----------------- ");
        System.out.printf("Numero de clientes que abasteceram com álcool: %d clientes\n",alcool);
        System.out.printf("Numero de clientes que abasteceram com gasolina: %d clientes\n",gasolina);
        System.out.printf("Numero de clientes que abasteceram com diesel: %d clientes\n",diesel);

        sc.close();
    }   
}
