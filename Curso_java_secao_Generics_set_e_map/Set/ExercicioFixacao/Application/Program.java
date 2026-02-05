package Curso_java_secao_Generics_set_e_map.Set.ExercicioFixacao.Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Curso_java_secao_Generics_set_e_map.Set.ExercicioFixacao.Entities.Students;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for curse A? ");
        int n = sc.nextInt();

        Set <Students> set = new HashSet<>();

        for(int i = 0; i < n; i++ ){
            System.out.printf("Digite o codigo do Aluno #%d : ", i+1);
            Integer code = sc.nextInt();
            set.add(new Students(code));   
        }

        System.out.print("How many students for curse B? ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++ ){
            System.out.printf("Digite o codigo do Aluno #%d : ", i+1);
            Integer code = sc.nextInt();
            set.add(new Students(code));   
        }

        System.out.print("How many students for curse C? ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++ ){
            System.out.printf("Digite o codigo do Aluno #%d : ", i+1);
            Integer code = sc.nextInt();
            set.add(new Students(code));   
        }

        System.out.println("Total de Students: " + set.size());
        sc.close();
    }
}
