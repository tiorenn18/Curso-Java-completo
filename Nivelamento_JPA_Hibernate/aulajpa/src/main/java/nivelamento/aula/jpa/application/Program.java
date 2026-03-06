package nivelamento.aula.jpa.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import nivelamento.aula.jpa.dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 3);

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();


        System.out.println();
        System.out.println(p);

        System.out.println("Pronto");

        em.close();
    }

}