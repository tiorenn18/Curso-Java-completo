package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;

public class Aula_Funcoes_matematicas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Double x, y, z;
        x = 3.0; y = 4.0; z = -5.0;

        Double A, B, C;
        A = Math.sqrt(x);   /* Raiz quadrada */
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.printf("Raiz quadrada de %s é igual a: %s \n", x, A);
        System.out.printf("Raiz quadrada de %s é igual a: %s \n", y, B);
        System.out.printf("Raiz quadrada de 25 é igual a: %s \n",C);
        System.out.println();

        A = Math.pow(x,y);  /* Potenciaçao */
        B = Math.pow(x,2.0);
        C = Math.pow(5.0,2.0);

        System.out.printf("%s elevado a %s = %.1f \n", x, y, A);
        System.out.printf("%s elevado ao quadrado = %.1f \n", x, B);
        System.out.printf("5 elevado ao quadrado = %.1f \n", C);
        System.out.println();

        A = Math.abs(y); /* Valor Absoluto */
        B = Math.abs(z);

        System.out.printf("Valor absoluto de %s é igual %.1f \n", y, A);
        System.out.printf("Valor absoluto de %s é igual %.1f \n", z, B);
    }
}
