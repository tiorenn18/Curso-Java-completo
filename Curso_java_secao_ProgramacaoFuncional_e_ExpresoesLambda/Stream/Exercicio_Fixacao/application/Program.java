package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Stream.Exercicio_Fixacao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Stream.Exercicio_Fixacao.Entities.Salary;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full path file: ");
        String path = sc.nextLine();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){

            List<Salary> list = new ArrayList<>();

            String line = bf.readLine();
            while (line != null) {
                String [] fields = line.split(",");
                list.add(new Salary(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bf.readLine();
            }

            System.out.print("Enter Salary: ");
            Double salary = sc.nextDouble();

            List <String> emails = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");

			emails.forEach(System.out::println);

            Double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M' )
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x,y) -> x + y );

            System.out.println("Sum of salary from people starts with 'M': " + String.format("%.2f", sum));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}
