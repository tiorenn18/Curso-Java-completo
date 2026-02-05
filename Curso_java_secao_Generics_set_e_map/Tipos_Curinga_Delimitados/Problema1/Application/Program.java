package Curso_java_secao_Generics_set_e_map.Tipos_Curinga_Delimitados.Problema1.Application;

import java.util.ArrayList;
import java.util.List;

import Curso_java_secao_Generics_set_e_map.Tipos_Curinga_Delimitados.Problema1.Entities.Circle;
import Curso_java_secao_Generics_set_e_map.Tipos_Curinga_Delimitados.Problema1.Entities.Retangle;
import Curso_java_secao_Generics_set_e_map.Tipos_Curinga_Delimitados.Problema1.Entities.Shape;

public class Program {
    public static void main(String[] args) {        // Nota 1 - Soluçoes impróprias:    
        
    List <Shape> myShapes = new ArrayList<>();
    myShapes.add(new Retangle(3.0, 2.0));
    myShapes.add(new Circle(2.0));

    List <Circle> myCircles = new ArrayList<>();
    myCircles.add(new Circle(3));
    myCircles.add(new Circle(2));   

    System.out.println("Total Area: " + String.format("%.2f", totalArea(myShapes)));
    }    

    public static double totalArea(List <? extends Shape > list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;       
    }       // Nota 2 - Não Conseguiremos Adicionar elementos na lista do método.
}
