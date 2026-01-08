package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio5_Funcoes_Matematicas {
    public static void main(String[] args) {
        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

        // Entrada: 12 _ 1 _ 5.30 / 16 2 5.10 ; Saida: Valor a pagar: 15.50 //

    Locale.setDefault(Locale.US);

    int Codpeça1, Codpeça2, numpeça1, numpeça2;
    double valPpeça1, valPpeça2;

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o Codigo da primeira peça: "); Codpeça1 = sc.nextInt();
    System.out.printf("Numeros de peças da peça de codigo %d: ",Codpeça1); numpeça1 = sc.nextInt();
    System.out.printf("Valor por unidade da peça %d: ",Codpeça1); valPpeça1 = sc.nextDouble();
    System.out.println();
    System.out.print("Digite o Codigo da Segunda peça: "); Codpeça2 = sc.nextInt();
    System.out.printf("Unidades da peça de codigo %d: ",Codpeça2); numpeça2 = sc.nextInt();
    System.out.printf("Valor por unidade da peça %d: ",Codpeça2); valPpeça2 = sc.nextDouble();
    System.out.println();

    double valortotal = numpeça1 * valPpeça1 + (numpeça2*valPpeça2);
    System.out.printf("Valor a pagar: %.2f \n",valortotal);
    
    sc.close();
    }
}  
