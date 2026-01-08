package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

import Curso_codigos_javaPart1._Classes_AulaJava.MaisVelho;

public class Exercicio_fixacao_vetor10 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha. */
        Scanner sc = new Scanner(System.in);
        int n,maior; 
        String NomeDoMaior;

        System.out.print("Digite o valor de casas do vetor: "); n = sc.nextInt();
        MaisVelho[] nums = new MaisVelho[n];

        maior = 0;
        NomeDoMaior = "";

        for (int i = 0; i < nums.length ; i++){
            sc.nextLine();
            System.out.print("Digite o nome da pessoa "+i +": "); String name = sc.nextLine();
            System.out.print("Digite a idade da pessoa "+i +": "); int age = sc.nextInt();
            nums[i] = new MaisVelho(name, age);
            if (nums[i].getAge() > maior) {
                maior = nums[i].getAge();
                NomeDoMaior = nums[i].getName();
            }
        }
        System.out.printf("A pessoa mais velha foi %s com %d anos \n",NomeDoMaior,maior);
        sc.close();
    }
}
