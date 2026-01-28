package Curso_java_seçao_arquivos.Exercicio_Fixaçao.Exercicio_Fixaçao_Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Curso_java_seçao_arquivos.Exercicio_Fixaçao.classes.Product;

public class Corecao_Exercicio {
    public static void main(String[] args) throws ParseException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List <Product> list = new ArrayList<>();

        File sourceFileStr = new File("C:\\Users\\Érico renan\\Downloads\\Products2\\Input.csv");
        String sourceFolderStr = sourceFileStr.getParent();

        Boolean success = new File(sourceFolderStr + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String [] fields = itemCsv.split(", ");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine(); 
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for(Product item : list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.totalValue()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED");

            } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
            }

        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}