package Curso_java_secao_Generics_set_e_map.Map.Demonstracoes.Demonstrao1;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map <String, String> cookies = new TreeMap<>();   
        
        cookies.put("Username", "maria");
        cookies.put("Email", "maria@gmail.com");
        cookies.put("Phone", "99071233");

        cookies.remove("Email");
        cookies.put("Phone", "99071234");

        System.out.println("Contais 'Phone' key: "+ cookies.containsKey("Phone"));
        System.out.println("Phone Number: " + cookies.get("Phone"));
        System.out.println("Email: " + cookies.get("Email"));
        System.out.println("Size: " + cookies.size());

        System.out.println();

        System.out.println("ALL COOKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}