package fr.diginamic;

import fr.diginamic.entities.Bank;
import fr.diginamic.entities.Savings;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bank");
        EntityManager em = emf.createEntityManager();

        EntityTransaction t = em.getTransaction();
        t.begin();

        Bank bank = em.find(Bank.class, 2);
        if (bank != null) {
            System.out.println(bank.toString());
            return;
        } else {
            Bank usaa = new Bank();
            Savings richardSavings = new Savings();

            usaa.setName("USAA");
            System.out.println(usaa.getName());
            em.persist(usaa);
        }

        t.commit();
        em.close();

    }

}