package aulas__java_meio;

import aulas__java_meio._Classes_AulaJava.Salary;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_Salary_ {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Salary salario = new Salary();

        System.out.print("Name: "); salario.Name = sc.nextLine(); 
        System.out.print("Gross Salary: "); salario.GrossSalary = sc.nextDouble(); 
        System.out.print("Tax: "); salario.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("employee:" + salario);
        System.out.println();

        System.out.print("Wich percentage to increase salary: "); salario.increaseSalary(sc.nextDouble());
        System.out.println();
        
        System.out.println("employee:" + salario);
        
        sc.close();
    }
}
