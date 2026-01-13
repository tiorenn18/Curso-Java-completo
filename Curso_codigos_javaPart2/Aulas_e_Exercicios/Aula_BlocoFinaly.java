package Aulas_e_Exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula_BlocoFinaly {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Érico renan\\Documents\\text.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR OPENING FILE " + e.getMessage());
        }
        finally{
            if (sc != null){
                sc.close();
            }
        }
        System.out.println("Finally block");
    }
}
