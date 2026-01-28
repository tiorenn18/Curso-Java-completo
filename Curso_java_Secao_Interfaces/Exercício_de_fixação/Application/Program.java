package Curso_java_Secao_Interfaces.Exercício_de_fixação.Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Curso_java_Secao_Interfaces.Exercício_de_fixação.Model.Entities.Contract;
import Curso_java_Secao_Interfaces.Exercício_de_fixação.Model.Entities.Installment;
import Curso_java_Secao_Interfaces.Exercício_de_fixação.Model.Services.ContractService;
import Curso_java_Secao_Interfaces.Exercício_de_fixação.Model.Services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os Dados: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService()); 
        contractService.processContract(obj, n);

        System.out.println("Parcelas: ");
        for(Installment installment : obj.getInstallments()){
            System.out.println(installment  );
        }

        sc.close();
    }
}
