package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.Aprovados;

public class Exercicio_fixacao_vetor11 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis). */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n; System.out.print("Digite quantos espaços vao ter no vetor: "); n = sc.nextInt();
        Aprovados [] alunos = new Aprovados[n];

        for (int i = 0; i < alunos.length; i++){
            sc.nextLine();
            System.out.print("Digite o nome do aluno "+i + ": "); String name = sc.nextLine();
            System.out.print("Digite a nota1 do aluno: "); double nota1 = sc.nextDouble();
            System.out.print("Digite a nota2 do aluno: "); double nota2 = sc.nextDouble();
            alunos[i] = new Aprovados(name, nota1, nota2);
        }

        System.out.println("Alunos Aprovados: ");
        for (int i = 0; i < alunos.length; i++)
            if (alunos[i].mediaAlunos() >= 6) {    
                System.out.println(alunos[i].getName());
            }
        sc.close();

    }
}