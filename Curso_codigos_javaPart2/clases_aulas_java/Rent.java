package clases_aulas_java;

public class Rent{  // classe utilizada em exercicio_atualizado_vect
    private String name;
    private String email;

    public Rent(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public String toString(){
        return name +", " + email;
    }

}

