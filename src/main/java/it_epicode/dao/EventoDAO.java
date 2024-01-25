package it_epicode.dao;

import it_epicode.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EventoDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneevento");
        em = emf.createEntityManager();
    }

    public void save(Evento e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();
    }

    public Evento getById(int id){
        return em.find(Evento.class, id);
    }

    public void delete(Evento e){
        Evento ev = getById(e.getId());

        EntityTransaction et = em.getTransaction();
        et.begin();

        em.remove(ev);

        et.commit();
    }
}
