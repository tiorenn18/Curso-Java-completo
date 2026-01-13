package Aulas_e_Exercicios.Metodos_Abstratos.Classes;

import Aulas_e_Exercicios.Metodos_Abstratos.Enums.Color;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, double radius) {
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
