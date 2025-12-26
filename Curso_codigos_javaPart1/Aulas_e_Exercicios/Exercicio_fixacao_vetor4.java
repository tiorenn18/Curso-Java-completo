package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.Alturas_vect;

public class Exercicio_fixacao_vetor4 {
    public static void main(String[] args) {
    /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    bem como os nomes dessas pessoas caso houver. */
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Alturas_vect[] vect = new Alturas_vect[n];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Escreva o nome da pessoa "+(i+1) +": "); String name = sc.nextLine();
            System.out.print("Escreva a idade da pessoa "+(i+1) +": "); int idade = sc.nextInt();
            System.out.print("Escreva a altura da pessoa "+(i+1) +": "); double altura = sc.nextDouble();
            vect[i] = new Alturas_vect(name, idade, altura);
        }
        int nmenor = 0;
        double alturatotal = 0.0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() < 16) {
                nmenor ++; 
            }
            alturatotal += vect[i].getAltura();
        }

        double alturaMedia = alturatotal / n;
        double percentualmenores = ((double) nmenor /n ) * 100;

        System.out.printf("\nAltura media = %.2f \n", alturaMedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", percentualmenores);
        
        for(int i = 0; i < n; i++) {
	        if (vect[i].getIdade() < 16) {
	        	System.out.printf("%s\n", vect[i].getName());
	        }

        }

        sc.close();
    }
}
