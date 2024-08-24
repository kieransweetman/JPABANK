package fr.diginamic.db;

import fr.diginamic.entities.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * ConnexionJpa
 */
public class Connection {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test_pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tm = em.getTransaction();

        tm.begin();
        Client c = em.find(Client.class, 1);

        tm.commit();

        System.out.println(c.toString());
    }
}