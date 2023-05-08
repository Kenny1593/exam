package com.web.tp.tp_s6_p14_web_design_mai_2022.models;


import javax.persistence.Entity;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "publication")
public class Publication {
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nom_pub")
    private String nom_pub;
    @Column(name = "contenu")
    private String contenu;
    @Column(name = "id_type")
    private Integer id_type;
    @Column(name = "date")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom_pub() {
        return nom_pub;
    }

    public void setNom_pub(String nom_pub) {
        this.nom_pub = nom_pub;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Integer getId_type() {
        return id_type;
    }

    public void setId_type(Integer id_type) {
        this.id_type = id_type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUrl(){
        String url="Intelligence_Artificielle_"+this.getNom_pub().replace(" ","_");
        return url;
    }

    public Publication() {
    }

    public Publication(Integer id_type) {
        this.id_type = id_type;
    }
}
