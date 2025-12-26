package aulas__java_meio._Classes_AulaJava;

public class MaisVelho {
    private String name;
    private int age;

    public MaisVelho(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
