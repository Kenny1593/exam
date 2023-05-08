package com.web.tp.tp_s6_p14_web_design_mai_2022.models;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nom")
    private String nom;
    @Column(name = "mail")
    private String mail;
    @Column(name ="pwd")
    private String pwd;




    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
