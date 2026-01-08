package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4_Funcoes_Matematicas {
    public static void main(String[] args) {

        /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais. */ /* Entrada: 25 _ 100 _ 5.50 Saida: number: 25 salary: U$ 550.0  */
    
    double horas, salary,Valor_hora_Trabalhada;
    int number;
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite seu Codigo: "); number = sc.nextInt();
    System.out.print("Digite suas Horas Trabalhadas: "); horas = sc.nextDouble();
    System.out.print("Digite Quanto você ganha por hora Trabalhada: "); Valor_hora_Trabalhada = sc.nextDouble();

    salary = horas * Valor_hora_Trabalhada;
    System.out.println();

    System.out.println("Codigo = "+ number);
    System.out.printf("salario = %.2f \n",salary);
    sc.close();
    }
    
}
