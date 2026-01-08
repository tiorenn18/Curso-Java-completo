package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Aula_Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int Higher = max(num1, num2, num3);
        showResult(Higher);
        
        sc.close();
    }
 
    public static int max(int x, int y, int z){
        int aux;
        if (x > z && z > y) {
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
    
}