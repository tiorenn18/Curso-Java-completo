package Aulas_e_Exercicios.Metodos_Abstratos.Classes;

import Aulas_e_Exercicios.Metodos_Abstratos.Enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
