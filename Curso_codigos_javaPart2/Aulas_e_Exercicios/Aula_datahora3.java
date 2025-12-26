package aulas_java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula_datahora3 {
    public static void main(String[] args) {
        // converter data hora global para local:
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:40:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);

        System.out.println();

        // Obter dados de uma data local: dia/mes/ano/horario
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
        System.out.println();
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("D05 minutos = " + d05.getMinute());
        System.out.println("D05 segundos = " + d05.getSecond());

    }
}
