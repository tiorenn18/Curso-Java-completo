package Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Entities;

import Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Enums.Colorr;

public class Circle extends AbstractShape {
    private double radius;

    public Circle(Colorr color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
