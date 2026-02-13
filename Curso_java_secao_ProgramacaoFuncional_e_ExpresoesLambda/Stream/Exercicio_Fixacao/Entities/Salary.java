package Curso_java_secao_ProgramacaoFuncional_e_ExpresoesLambda.Stream.Exercicio_Fixacao.Entities;

public class Salary {
    private String name;
    private String email;
    private Double salary;

    public Salary(String name, String email, Double salary){
        this.name = name;
        this.email = email;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public String toString(){
        return name + ", " + email + ", Salary: R$" + String.format("%.2f", salary);
    }

}
