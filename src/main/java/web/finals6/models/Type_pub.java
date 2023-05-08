package web.finals6.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;


@Entity
@Table(name = "type_pub")
public class Type_pub {
    @Id
    @Column
    private Integer id;
    @Column
    private String nom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
