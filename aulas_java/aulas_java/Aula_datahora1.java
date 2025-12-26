package aulas_java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula_datahora1 {
    public static void main(String[] args) {
    // https://docs.oracle.com/en/java/javase/21/docs/api//java.base/java/time/format/class-use/DateTimeFormatter.html  
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // formato custumizado
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  

        LocalDate d01 = LocalDate.now(); // istanciando agora.
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        
        LocalDate d04 = LocalDate.parse("2022-07-20"); // instanciando apartir de texto ISo 8601
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T15:40:26");
        Instant d06 = Instant.parse("2022-07-20T15:40:26Z"); 
        Instant d07 = Instant.parse("2022-07-20T15:40:26-03:00"); 

        LocalDate d08 = LocalDate.parse("20/07/2008", fmt1 /*com variavel [fmt1] ou diretamentente com o formato. ->DateTimeFormatter.ofPattern("dd/MM/yyyy")*/ );  // instanciando a partir de texto no formato custumizado
        LocalDateTime d09 = LocalDateTime.parse("20/07/2008 14:00", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 10);//intanciando apartir de dados isolados / dia, mês, ano, [hórario]
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 10, 14, 30);
        
        System.out.println("D01: "+ d01);
        System.out.println("D02: "+ d02);
        System.out.println("D03: "+ d03);
        System.out.println("D04: "+ d04);
        System.out.println("D05: "+ d05);
        System.out.println("D06: "+ d06);
        System.out.println("D07: "+ d07);
        System.out.println("D08: "+ d08);
        System.out.println("D09: "+ d09);
        System.out.println("D10: "+ d10);
        System.out.println("D11: "+ d11);

    }
}
