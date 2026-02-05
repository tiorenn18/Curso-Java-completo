package Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.project;

import Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Entities.AbstractShape;
import Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Entities.Circle;
import Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Entities.Retangle;
import Curso_java_Secao_Interfaces.Herdar_Vs_Comprir_Contrato.Metodos_Abstratos.Enums.Colorr;


public class program {
    public static void main(String[] args) {
		AbstractShape s1 = new Circle(Colorr.BLACK, 2.0);    
		AbstractShape s2 = new Retangle(Colorr.RED, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
