package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_fixacao_vetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quartos = 10;
        int [] vect = new int[quartos];

        System.out.print("How many rooms be retend? "); int rooms = sc.nextInt();

        String [] names = new String[rooms];
        String [] emails = new String[rooms];

        for (int i = 0; i < rooms; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: "); names[i] = sc.nextLine();
            System.out.print("Email: "); emails[i] = sc.nextLine();
            System.out.print("Room: "); vect[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println("Bussy rooms:");

        for (int i = 0; i < rooms; i++){
            System.out.printf("%d: %s, %s \n", vect[i], names[i],emails[i]);
        }
        sc.close();
    }
}
