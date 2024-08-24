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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Savings> getSavings() {
        return savings;
    }

    public void setSavings(List<Savings> savings) {
        this.savings = savings;
    }

    public List<LifeInsurrance> getLifeInsurrances() {
        return lifeInsurrances;
    }

    public void setLifeInsurrances(List<LifeInsurrance> lifeInsurrances) {
        this.lifeInsurrances = lifeInsurrances;
    }

    @ManyToMany
    @JoinTable(name = "client_savings", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "savings_id"))
    private List<Savings> savings;

    @ManyToMany
    @JoinTable(name = "client_lifeinsurrance", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "lifeinsurrance_id"))
    private List<LifeInsurrance> lifeInsurrances;

}
