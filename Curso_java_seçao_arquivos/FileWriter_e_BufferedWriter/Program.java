package Curso_java_seçao_arquivos.FileWriter_e_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{"good morniung","good afternoon", "Good Night"};

        String path = "c:\\Users\\Érico renan\\Downloads\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
