package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Product;
import Services.CalculationService;

public class Program {
    public static void main(String[] args) {
        List <Product> list = new ArrayList<>();

        String path = "C:\\Downloads\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line =  br.readLine();
            while (line != null) {
                String[] field = line.split(",");
                list.add(new Product(field[0], Double.parseDouble(field[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most Expensive ");
            System.out.println(x);
        } catch (IOException e){
            System.out.println( "Error: " + e.getMessage());
        }
        
    }
}
