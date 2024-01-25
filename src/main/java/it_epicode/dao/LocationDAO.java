package it_epicode.dao;

import it_epicode.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LocationDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public LocationDAO(){
        emf = Persistence.createEntityManagerFactory("gestioneevento");
        em = emf.createEntityManager();
    }

    public void save(Location e){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(e);

        et.commit();
    }

    public Location getById(int id){
        return em.find(Location.class, id);
    }

    public void delete(Location e){
        Location ev = getById(e.getId());

        EntityTransaction et = em.getTransaction();
        et.begin();

        em.remove(ev);

        et.commit();
    }
}
