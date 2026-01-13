package Aulas_e_Exercicios.Exercicio_fixacao_classes_abstratas.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Aulas_e_Exercicios.Exercicio_fixacao_classes_abstratas.Classes.Company;
import Aulas_e_Exercicios.Exercicio_fixacao_classes_abstratas.Classes.Individual;
import Aulas_e_Exercicios.Exercicio_fixacao_classes_abstratas.Classes.Taxplayer;

public class Taxas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Taxplayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax players: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if (ch == 'c' || ch == 'C') {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                Integer numberEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberEmployees));
            }

            else{
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
        }
        double sum = 0;

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Taxplayer tp : list){
            double tax = tp.Impost();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.printf("TOTAL TAXES $ %.2f \n",sum);
        
        sc.close();
    }
}
