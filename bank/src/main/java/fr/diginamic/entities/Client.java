package fr.diginamic.entities;

import java.util.Date;

import jakarta.persistence.Embedded;

public class Client {

    private String name;
    private String lastName;
    private Date dob;

    @Embedded
    Adresse adresse;

}
