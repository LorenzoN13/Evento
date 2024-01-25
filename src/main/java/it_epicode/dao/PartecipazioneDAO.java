package it_epicode.dao;

import it_epicode.entities.Partecipazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PartecipazioneDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PartecipazioneDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneevento");
        em = emf.createEntityManager();
    }

    public void save(Partecipazione e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();
    }

    public Partecipazione getById(int id){
        return em.find(Partecipazione.class, id);
    }

    public void delete(Partecipazione e){
        Partecipazione ev = getById(e.getId());

        EntityTransaction et = em.getTransaction();
        et.begin();

        em.remove(ev);

        et.commit();
    }
}
