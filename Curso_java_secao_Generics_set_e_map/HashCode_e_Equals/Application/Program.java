package Curso_java_secao_Generics_set_e_map.HashCode_e_Equals.Application;

import Curso_java_secao_Generics_set_e_map.HashCode_e_Equals.Entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "Alex@gmail.com");
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
