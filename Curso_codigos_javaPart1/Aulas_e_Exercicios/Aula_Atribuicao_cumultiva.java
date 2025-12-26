package aulas_java_Iniciando;

import java.util.Locale;
import java.util.Scanner;

public class Aula_Atribuicao_cumultiva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();

        double conta = 50.00;

        if (minutos > 100){
            conta +=  (minutos - 100) * 2.00;
        }
        System.out.printf("valor a pagar %.2f \n",conta);
        sc.close();
    }
}
