package aulas_java_Iniciando;

import java.util.Locale;
import java.util.Scanner; /*Faça: sc.close(); quando não precisar mais do objeto sc*/

public class Aula_Codagem2_part1 {

public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String nome; int idade; Double peso; char codigo;
    
    System.out.print("Digite seu nome: "); nome = sc.next();
    System.out.print("Digite sua idade: "); idade = sc.nextInt();
    System.out.print("Digite seu peso: "); peso = sc.nextDouble();
    System.out.print("Digite seu codigo: "); codigo = sc.next().charAt(0);
    System.out.println();
    System.out.printf("Seu nome é: %s e Você tem %d Anos e pesa %.2f kilos seu codigo é: %c \n", nome, idade, peso, codigo);
    
    sc.close();
    }
}
