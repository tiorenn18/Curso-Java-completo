package aulas_java_Iniciando;

import java.util.Scanner;

public class Estruturas_Condicionais {
    public static void main(String[] args) {
        int horario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Que horas são? "); horario = sc.nextInt();

        if (horario < 12) {
            System.out.println("Bom dia."); 
        }
        else if (horario > 12 && horario < 19){
                System.out.println("boa tarde.");
        }
        else {
                System.out.println("boa noite.");
        }
        sc.close();
    }
}