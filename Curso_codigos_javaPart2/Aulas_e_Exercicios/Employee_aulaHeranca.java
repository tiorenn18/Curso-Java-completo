package Aulas_e_Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import clases_aulas_java.Employee_Heranca;
import clases_aulas_java.OutSourcedEmployee;

public class Employee_aulaHeranca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee_Heranca> list = new ArrayList<>();

        System.out.print("Enter the number of emplooyes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Emplooye " + i + " data: ");
            System.out.print("Outsourced(y/n)? ");
            char resp = sc.next().charAt(0);

                System.out.println();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Hours: ");
                Integer hours = sc.nextInt();

                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

            if (resp == 'y') {
                System.out.print("Adicional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee_Heranca emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
                // Or list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);)
            }
            else{
                Employee_Heranca emp = new Employee_Heranca(name, hours, valuePerHour);
                list.add(emp); 
                // Or list.add(new Employee_Heranca(name, hours, valuePerHour);)
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for ( Employee_Heranca emp : list ){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payMent()));
        }
        sc.close();
    }
}
