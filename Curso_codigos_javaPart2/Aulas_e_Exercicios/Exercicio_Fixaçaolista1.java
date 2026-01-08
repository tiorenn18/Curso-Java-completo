package Aulas_e_Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import clases_aulas_java.Employee;

public class Exercicio_Fixaçaolista1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Employee> list = new ArrayList<>();
        System.out.print("Quantos funcionarios vão ser registrados? "); int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");

            System.out.print("Id: "); int id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id already taken. try again: ");
                id = sc.nextInt();

            }
            System.out.print("Name: "); 
            sc.nextLine();

            String name = sc.nextLine();
            System.out.print("Salary: "); Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee Id that will have salary increase: "); int id = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!" );
        }
        else {
            System.out.print("Enter percentage to increase: "); double percentage = sc.nextDouble();
            emp.IncreaseSalary(percentage);
        }

        System.out.println("List of employees: ");

        for (Employee obj : list ){
            System.out.println(obj);
        }
        sc.close();
    }
    public static boolean hasId(List<Employee> list, int id ){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
