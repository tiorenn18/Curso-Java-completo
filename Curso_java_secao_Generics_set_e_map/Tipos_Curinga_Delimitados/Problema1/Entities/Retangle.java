package Curso_java_secao_Generics_set_e_map.Tipos_Curinga_Delimitados.Problema1.Entities;

public class Retangle implements Shape {

    private double width;
    private double height;

    public Retangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double area(){
        return width * height;
    }

}


