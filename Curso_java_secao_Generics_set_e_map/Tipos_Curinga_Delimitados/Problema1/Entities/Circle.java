package Curso_java_secao_Generics_set_e_map.Tipos_Curinga_Delimitados.Problema1.Entities;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius ;
    }

}
