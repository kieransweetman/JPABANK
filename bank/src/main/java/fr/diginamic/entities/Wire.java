package fr.diginamic.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wire extends Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String recipient;

}
