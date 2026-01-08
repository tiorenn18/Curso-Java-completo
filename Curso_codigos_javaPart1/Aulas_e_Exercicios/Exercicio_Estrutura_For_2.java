package Curso_codigos_javaPart1.Aulas_e_Exercicios;

import java.util.Scanner;

public class Exercicio_Estrutura_For_2 {
    public static void main(String[] args) {
        
/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */

        Scanner sc = new Scanner(System.in);
        int in, out,x,num;

        in = 0;
        out = 0;

        System.out.print("Digite um valor para a contagem: "); x = sc.nextInt();

        for (int i = 1; i <= x; i+=1){

            if ( i == 1){ 
            System.out.println("Digite um valor: "); num = sc.nextInt();
            }
            else{
                num = sc.nextInt();
            }

            if (num >= 10 & num <= 20) {
            in += 1;
            }

            else {
            out += 1;
            }

            }

        System.out.printf("valor dentro do intervalo: %d \n",in);
        System.out.printf("valor fora do intervalo: %d \n",out);

        sc.close();
    }
}
