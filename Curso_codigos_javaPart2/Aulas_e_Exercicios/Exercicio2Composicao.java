package Aulas_e_Exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import clases_aulas_java.Comment;
import clases_aulas_java.Post;

public class Exercicio2Composicao {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(
            sdf.parse("1/01/2026 13:05:44"), 
            "Treveling to New Zealand", 
            "I'm going to visit this wonderful country!", 
            12);
        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);
        System.out.println();
        
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");
        Post p2 = new Post(
            sdf.parse("2/01/2026 18:14:19"), 
            "Good night guys", 
            "See you tomorrow", 
            5);
            p2.addComments(c3);
            p2.addComments(c4);

        System.out.println(p2);
    }
}
