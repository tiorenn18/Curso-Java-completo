package Curso_codigos_javaPart1.Aulas_e_Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_Condicionais5 {
    public static void main(String[] args) {
        /* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo,quantidade;
        double valor_total;
        valor_total = 0;

        System.out.println("- CODIGO - ESPECIFICAÇÃO - PREÇO -");
        System.out.println("- 1 - CACHORRO QUENTE - R$ 4.00 -");
        System.out.println("- 2 -     X-SALADA    - R$ 4.50 -");
        System.out.println("- 3 -     X-BACON     - R$ 5.00 -");
        System.out.println("- 4 - TORRADA SIMPLES - R$ 2.00 -");
        System.out.println("- 5 -   REFRIGERANTE  - R$ 1.50 -");
        System.out.println();

        System.out.print("Codigo do seu produto: ");codigo = sc.nextInt();
        System.out.print("Quantidade: ");quantidade = sc.nextInt();

        if (codigo == 1){
            valor_total = quantidade * 4.00;
            System.out.printf("Valor total: R$ %.2f \n",valor_total);
        }
        else if (codigo == 2){
            valor_total = quantidade * 4.50;
            System.out.printf("Valor total: R$ %.2f \n",valor_total);
        }
        else if (codigo == 3){
            valor_total = quantidade * 5.00;
            System.out.printf("Valor total: R$ %.2f \n",valor_total);
        }
        else if (codigo == 4){
            valor_total = quantidade * 2.00;
            System.out.printf("Valor total: R$ %.2f \n",valor_total);
        }
        else if (codigo == 5){
            valor_total = quantidade * 1.50;
            System.out.printf("Valor total: R$ %.2f \n",valor_total);
        }
        else{
            System.err.println("ERROR 12345 - Digite um codigo que esteja em nosso sistema.");
        }

        sc.close();
    }
}
