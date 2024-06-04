package fr.diginamic.entities;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Operation {

    private String motif;
    private Double amount;
    private Date date;

}
