package aulas_java_Iniciando;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_Funcoes_Matematicas {
    public static void main(String[] args) {
        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
            casas decimais conforme exemplos.       Entrada: 2.0; Saida: A = 12.5664
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double area,raio, π;

        π = 3.14159;

        System.out.print("Digite o valor do raio do seu circulo: " ); raio = sc.nextDouble();

        area = π * (raio = Math.pow(raio, 2.0));

        System.out.printf("Area = %.4f \n", area);

        sc.close();
    }
}
