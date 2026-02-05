package Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Entities;

import Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Enums.Colorr;

public class Retangle extends AbstractShape  {
    private double wight;
    private double height;


    public Retangle(Colorr color, double wight, double height) {
        super(color);
        this.wight = wight;
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return wight * height;
    }
    
}
