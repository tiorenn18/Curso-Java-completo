package aulas__java_meio;

import java.util.Locale;
import java.util.Scanner;
import aulas__java_meio._Classes_AulaJava.Student;

public class Exercicio3_Student_ {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome do estudante: "); student.nome = sc.nextLine();
       System.out.print("Nota do primeiro trimeste: "); student.nota1 = sc.nextDouble();
       System.out.print("Nota do segundo trimeste: "); student.nota2 = sc.nextDouble();
       System.out.print("Nota do terceiro trimeste: "); student.nota3 = sc.nextDouble();


       System.out.printf("Media : %.2f \n", student.media());

        if (student.media() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f Points \n",student.points());
        }
        else{
            System.out.println("PASS");
        }
        sc.close();
    }
}
