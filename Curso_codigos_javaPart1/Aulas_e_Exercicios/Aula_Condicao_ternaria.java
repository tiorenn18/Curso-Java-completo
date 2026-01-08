package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Locale;

public class Aula_Condicao_ternaria {
    public static void main(String[] args) {
        /*Sintaxe: (condiçõo) ? valor_se_verdadeiro : valor_se_falso */

        Locale.setDefault(Locale.US);

        double preco = 34.5; double desconto;

        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
    }
}
