package aulas_java_Iniciando;

import java.util.Scanner;

public class Aula_Estruturas_Repetitivas_While_{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma, x = sc.nextInt();
        soma = 0;

        while ( x != 0 ) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}
