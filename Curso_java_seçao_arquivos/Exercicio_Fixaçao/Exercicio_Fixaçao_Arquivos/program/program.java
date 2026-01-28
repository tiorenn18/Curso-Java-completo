package Curso_java_seçao_arquivos.Exercicio_Fixaçao.Exercicio_Fixaçao_Arquivos.program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Curso_java_seçao_arquivos.Exercicio_Fixaçao.classes.Product;

public class program {
    public static void main(String[] args) {
        boolean folder = new File("C:\\Users\\Érico renan\\Downloads" + "\\Products").mkdir();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Product> list = new ArrayList<>();

        System.out.print("Quantos produtos Diferentes você quer por na lista? ");
        int n = sc.nextInt();
        String [] lines = new String[n];
        String[] lines2 = new String[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Product #%d Data: \n", i+1);
            System.out.print("Nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Valor do produto: ");
            double price = sc.nextDouble();
            System.out.print("Quantas unidades do produto: ");
            Integer quantity = sc.nextInt();

            list.add(new Product(name, price, quantity));
            lines[i] = list.get(i).toString();
            System.out.println(lines[i]);
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Érico renan\\Downloads\\Products\\Input.csv",true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }

        boolean product = new File("C:\\Users\\Érico renan\\Downloads\\Products" + "\\out").mkdir();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Érico renan\\Downloads\\Products\\out\\sumarry.csv",true))){
            for(int i = 0; i < n; i ++){
                lines2[i] = list.get(i).getName()+ ", " +list.get(i).totalValue();
            }
            for (String line2 : lines2){
                bw.write(line2);
                bw.newLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
