package fr.diginamic.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

    private int number;
    private String road;
    private int zip;
    private String city;

}
