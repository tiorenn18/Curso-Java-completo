package aulas_java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula_datahora2 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20"); // instanciando apartir de texto ISo 8601
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:40:26");
        Instant d06 = Instant.parse("2022-07-20T15:40:26Z"); 

    // https://docs.oracle.com/en/java/javase/21/docs/api//java.base/java/time/format/class-use/DateTimeFormatter.html  
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

    System.out.println("d04 = " + d04.format(fmt1)); // 3 maneiras de instanciar 
    System.out.println("d04 = " + fmt1.format(d04));
    System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    System.out.println("d04 = " + fmt2.format(d05));
    System.out.println("d06 = " + fmt3.format(d06));

    }
}
