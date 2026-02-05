package Curso_java_Secao_Interfaces.Problema_Do_DIamante.models;

public class ConcreteScanner extends Device implements Scannner {

    public ConcreteScanner(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner Processing  : "+ doc);    
    }

    public String scan(){
        return "Scanned content";
    }
}
