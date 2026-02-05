package Curso_java_secao_Generics_set_e_map.Set.ExercicioFixacao.Entities;


public class Students implements Comparable<Students>{
    private Integer code;

    public Students(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Students other = (Students) obj;
        if (code != other.code)
            return false;
        return true;
    }
    
    @Override
    public int compareTo(Students o) {
        return code.compareTo(o.getCode());
    }
}
