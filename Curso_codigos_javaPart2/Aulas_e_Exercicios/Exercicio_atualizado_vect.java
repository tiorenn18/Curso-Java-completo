package Aulas_e_Exercicios;
    
import java.util.Scanner;
import clases_aulas_java.Rent;

public class Exercicio_atualizado_vect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rent [] vect = new Rent[10];
        System.out.print("How many rooms be retend? "); int rooms = sc.nextInt();

        for (int i = 0; i < rooms; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i+1));

            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Email: "); String email = sc.next();
            System.out.print("Room: "); int room = sc.nextInt();

            vect [room] = new Rent(name, email); 

            System.out.println();
        }

        System.out.println("Bussy rooms:");

        for (int i = 0; i < 10; i++){
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}