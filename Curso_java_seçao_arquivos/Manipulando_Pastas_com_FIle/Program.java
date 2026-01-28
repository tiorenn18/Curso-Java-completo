package Curso_java_seçao_arquivos.Manipulando_Pastas_com_FIle;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strpath = sc.nextLine(); 

        File path = new File(strpath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        System.out.println();
        
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files){
            System.out.println(file);
        }

        System.out.println();

        boolean success = new File(strpath + "\\subdir").mkdir();
        System.out.println("Directory Created succefully: " + success );
        sc.close();
    }
}
