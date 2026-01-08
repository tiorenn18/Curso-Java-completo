package Aulas_e_Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula_list {
    public static void main(String[] args) {
    /*  a lista não utiliza tipos primitivos
    utilizar a wrapper class do tal.*/

        List <String> list = new ArrayList<>();
        list.add("maria"); // adiciona um elemento na lista
        list.add("alex");
        list.add("bob");
        list.add("anna");
        list.add(2, "marco"); // adiciona um elemento na lista com uma posiça especifica sem prejudicar a lista

        //list.remove(index: 0 ) remove o elemento zero da lista nesse caso a maria.
        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------");

        list.removeIf(x -> x.charAt(0) == 'm');  // remove com um predicado
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------");
        System.out.println("index of bob: " + list.indexOf("bob")); 
        System.out.println("index of bob: " + list.indexOf("marco")); // quando nn encontra o elemento retorna -1
        System.out.println("----------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList()); // vai filtrar os elementos da lista
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("----------");
        String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
        System.out.println(name);
    }

}
