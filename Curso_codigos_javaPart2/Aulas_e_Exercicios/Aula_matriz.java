package aulas_java;

import java.util.Scanner;

public class Aula_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n; System.out.print("Tamanho da matriz: "); n = sc.nextInt();
        int [][] mat = new int[n][n];
        int negativos = 0;

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length ; j++){
                if (mat[i][j] < 0) {
                    negativos += 1;
                }
            }
        }

        System.out.println();
        System.out.println("Numeros negativos: "+ negativos);

        sc.close();
    }
}
