package Curso_java_seçao_arquivos.Informações_do_caminho_do_arquivo;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter File path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);

        System.out.println("GetName: " + path.getName());
        System.out.println("Getparent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
