package clases_aulas_java;

public class Employee {
    public Integer id;
    public String name;
    public Double salary;
    public Double percentage;

    public Employee(){
        
    }
    
    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }
    
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }

    public void IncreaseSalary(Double percentage){
        salary += salary * percentage / 100.0;
    }

    public String toString(){
        return id +", " + name +", " + String.format("%.2f", salary); 
    }
}