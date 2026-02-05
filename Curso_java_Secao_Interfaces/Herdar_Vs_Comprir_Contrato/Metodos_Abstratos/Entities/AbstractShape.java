package Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Entities;

import Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Enums.Colorr;

public abstract class AbstractShape implements Shape {
    
    private Colorr color;

    public AbstractShape(Colorr color) {
        this.color = color;
    }

    public Colorr getColor() {
        return color;
    }

    public void setColor(Colorr color) {
        this.color = color;
    }

}
