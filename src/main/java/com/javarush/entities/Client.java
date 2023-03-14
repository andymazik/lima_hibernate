package com.javarush.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="clients")
public class Client {
    @Id
    public int id;

    public String name;

    @Column(name="connection_date")
    public LocalDate connectionDate;

    public String tarif;

    public boolean isDeptor;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    public Manager manager;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", connectionDate=" + connectionDate +
                ", tarif='" + tarif + '\'' +
                ", isDeptor=" + isDeptor +
                ", manager=" + manager.id +
                '}';
    }

    public Client setId(int id) {
        this.id = id;
        return this;
    }


    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public Client setConnectionDate(LocalDate connectionDate) {
        this.connectionDate = connectionDate;
        return this;
    }

    public Client setTarif(String tarif) {
        this.tarif = tarif;
        return this;
    }

    public Client setDeptor(boolean deptor) {
        isDeptor = deptor;
        return this;
    }

    public Client setManager(Manager manager) {
        this.manager = manager;
        return this;
    }
}