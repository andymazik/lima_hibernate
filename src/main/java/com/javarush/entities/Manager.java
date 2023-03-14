package com.javarush.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager {
    @Id
    int id;
    String name;
    int departmentId;
    String title;

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", title='" + title + '\'' +
                '}';
    }
}
