package aulas__java_meio;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio_fixacao_vetor12 {
    /*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
    que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
    de homens. */

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n; System.out.print("Digite a quantidade de pessoas: "); n = sc.nextInt();

    Double [] altura = new Double[n];
    char [] sexo = new char[n];
    double maior, menor, soma, media; maior = 0; menor = Integer.MAX_VALUE; soma = 0; media = 0;
    int homens,mulheres; homens = 0; mulheres = 0;



    for (int i = 0; i < altura.length; i++){
        System.out.print("Digite a altura da pessoa de numero "+ (i+1) + ": "); 
        altura[i] = sc.nextDouble();
        if (altura[i] > maior) {
            maior = altura[i];
        }
        else if (altura[i] < menor) {
            menor = altura[i];
        }
        System.out.print("Digite o gênero [M/F] da pessoa de numero "+ (i+1) + ": ");
        sexo [i] = sc.next().charAt(0);
        if (sexo [i] == 'M') {
            homens += 1;
        }
        else if (sexo [i] == 'F') {
            mulheres += 1;
            soma += altura[i]; 
        }
    }

    media = soma / mulheres;

    System.out.println("Menor altura: "+ menor);
    System.out.println("Maior altura: "+ maior);
    System.out.printf("Media das alturas das mulheres %.2f \n", media);
    System.out.println("Numero de Homens: "+ homens);
    sc.close();
    }
}
