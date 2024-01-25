package it_epicode.dao;

import it_epicode.entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneevento");
        em = emf.createEntityManager();
    }

    public void save(Persona e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();
    }

    public Persona getById(int id){
        return em.find(Persona.class, id);
    }

    public void delete(Persona e) {
        Persona ev = getById(e.getId());

        EntityTransaction et = em.getTransaction();
        et.begin();

        em.remove(ev);

        et.commit();
    }
}
