package Curso_java_Secao_Interfaces.Problema_Do_DIamante.models;

public class ConcretePrinter extends Device implements Printer{

    public ConcretePrinter(String serialNumber){
        super(serialNumber);
    }
    
    @Override
    public void processDoc(String doc) {
        System.out.println("Printer Processing  : "+ doc);
    }

    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
