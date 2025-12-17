package aulas_java_Iniciando;
import java.util.Scanner;

public class Exercicio_Condicionais4 {
    public static void main(String[] args) {
        /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */

        Scanner sc = new Scanner(System.in);
        int horain, horafin, duracao;
        duracao = 24;

        System.out.print("Digite o horario de inicio do jogo: "); horain = sc.nextInt();
        System.out.print("Digite o horario do final do jogo: "); horafin = sc.nextInt();

        if (horain < horafin) {
            duracao = horafin - horain;
        }
        else {
            duracao = 24 - horain + horafin;
        }

    System.out.printf("O JOGO DUROU %d Horas",duracao);
    sc.close();

    }
}
