package Curso_java_seçao_arquivos.Lendo_Arquivos_Texto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Érico renan\\Downloads\\ola.txt");
        Scanner sc = null;   
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
