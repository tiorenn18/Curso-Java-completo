package aulas_java;

import java.util.Scanner;

public class Exercicio_fixacaoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m;
        System.out.print("Quantas linhas: ");n = sc.nextInt();
        System.out.print("Quantas Colunas: ");m = sc.nextInt();

        int [][] mat = new int[n][m];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print("Digite o valor da posiçao: " + "(" + i + ", " + j + ") : "); mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == x) {
                    System.out.println("Possition" + i + "," + j + ": ");     
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }               
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat[j].length-1) {
                        System.out.println("down: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
