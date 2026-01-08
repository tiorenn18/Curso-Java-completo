package Aulas_e_Exercicios;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula_datahora4 {
    public static void main(String[] args) {
        // calculos com data e hora

        LocalDate d04 = LocalDate.parse("2022-07-20"); 
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:40:26");
        Instant d06 = Instant.parse("2022-07-20T15:40:26Z"); 

        LocalDate pastWeekLocaldate = d04.minusDays(7);
        LocalDate nextWeekLocaldate = d04.plusDays(7);

        System.out.println("Semana passada = " + pastWeekLocaldate );
        System.out.println("Proxima semana = " + nextWeekLocaldate );
        System.out.println();

        LocalDateTime pastWeekLocaldateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocaldateTime = d05.plusDays(7);
       
        System.out.println("pastWeekLocaldatetime = " + pastWeekLocaldateTime );
        System.out.println("nextWeekLocaldatetime = " + nextWeekLocaldateTime);
        System.out.println();

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant );
        System.out.println("nextWeekInstant = " + nextWeekInstant );
        System.out.println();

        // calculando com datas

        Duration t1 = Duration.between(pastWeekLocaldate.atStartOfDay(), d04.atStartOfDay()); //Localdate
        Duration t2 = Duration.between(pastWeekLocaldateTime, d05); // localdate Time
        Duration t3 = Duration.between(pastWeekInstant, d06); // instant
        Duration t4 = Duration.between(d06, pastWeekInstant); // instant com primeira data sendo posterior a outra


        System.out.println("T1 dias = " + t1.toDays());
        System.out.println("T2 dias = " + t2.toDays());
        System.out.println("T3 dias = " + t3.toDays());
        System.out.println("T4 dias = " + t4.toDays());

    }
}
