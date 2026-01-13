package Aulas_e_Exercicios.Metodos_Abstratos.Classes;

import Aulas_e_Exercicios.Metodos_Abstratos.Enums.Color;

public class Retangle extends Shape  {
    private double wight;
    private double height;

    public Retangle() {
        super();
    }

    public Retangle(Color color, double wight, double height) {
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
