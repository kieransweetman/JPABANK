package fr.diginamic.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String lastName;
    private Date dob;

    @Embedded
    Adresse adresse;

    @ManyToMany
    private List<Account> accounts;

}
