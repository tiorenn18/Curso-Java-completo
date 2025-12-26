package aulas_java_Iniciando;

import java.util.Scanner;

public class Aula_Estruturas_Repetitiva_For_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma,num,ponteiro;
        soma = 0;

        System.out.print("Quantas vezes você quer repetir o looping: "); ponteiro = sc.nextInt();

        for (int i = 0; i < ponteiro; i += 1 ) {
            num = sc.nextInt();
            soma += num;
        }
        
        System.out.println();

        System.out.println(soma);
        sc.close();
    }
}
