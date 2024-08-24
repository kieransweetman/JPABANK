package fr.diginamic.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Operation {

    @Id
    @GeneratedValue
    private int id;
    private String motif;
    private Double amount;
    private Date date;

}
