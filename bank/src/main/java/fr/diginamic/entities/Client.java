package fr.diginamic.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastName;
    private Date dob;

    @Embedded
    Adresse adresse;

    @ManyToMany
    @JoinTable(name = "client_savings", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "savings_id"))
    private List<Savings> savings;

    @ManyToMany
    @JoinTable(name = "client_lifeinsurrance", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "lifeinsurrance_id"))
    private List<LifeInsurrance> lifeInsurrances;

}
