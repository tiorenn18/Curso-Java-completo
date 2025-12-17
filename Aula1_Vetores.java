package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;

public class Aula1_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Digite o valor de pessoas na pesquisa de altura: "); n = sc.nextInt();
        Double [] vect = new Double[n];

        for (int i = 0; i < n; i+=1 ){
            System.out.print("Digite a altura da pessoa "+ i +": " ); vect[i] = sc.nextDouble();   
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++ ){
            sum += vect[i];
        }
        double media = sum / n;
        
        System.out.printf("Altura Média: %.2f \n",media);

        sc.close();
    }
}
