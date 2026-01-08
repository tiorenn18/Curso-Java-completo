package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Aula_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;  System.out.print("Digite um numero para saber qual dia da semana é: "); x = sc.nextInt();
        String dia;

        switch (x) {
        case 1:
        dia = "domingo";
        break;
        case 2:
        dia = "segunda";
        break;
        case 3:
        dia = "terca";
        break;
        case 4:
        dia = "quarta";
        break;
        case 5:
        dia = "quinta";
        break;
        case 6:
        dia = "sexta";
        break;
        case 7:
        dia = "sabado";
        break;
        default:
        dia = "valor invalido";
        break;
        }
        System.out.printf("Dia da semana: %s ", dia);
        sc.close();
            }
        }
