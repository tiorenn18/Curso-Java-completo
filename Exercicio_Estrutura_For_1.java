package aulas_java_Iniciando;

import java.util.Scanner;

public class Exercicio_Estrutura_For_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x; 
        System.out.print("Digite até onde contar em numeros impares: "); x = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= x & x <= 1000; i += 2 ) {
            System.out.println(i);
        }
        
        sc.close();
    }
}
