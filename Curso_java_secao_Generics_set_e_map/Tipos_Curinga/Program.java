package Curso_java_secao_Generics_set_e_map.Tipos_Curinga;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List <String> myStr = Arrays.asList("maria,alex,bob");
        printList(myStr);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
            }
    }
}
