package com.vokye.vokyProject.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_vente;
    Integer id_point_vente;
    Integer id_chariot;
    Integer id_produit;
    Integer quantite;
    Date date_vente;

    public Integer getId_vente() {
        return id_vente;
    }

    public void setId_vente(Integer id_vente) {
        this.id_vente = id_vente;
    }

    public Integer getId_point_vente() {
        return id_point_vente;
    }

    public void setId_point_vente(Integer id_point_vente) {
        this.id_point_vente = id_point_vente;
    }

    public Integer getId_chariot() {
        return id_chariot;
    }

    public void setId_chariot(Integer id_chariot) {
        this.id_chariot = id_chariot;
    }

    public Integer getId_produit() {
        return id_produit;
    }

    public void setId_produit(Integer id_produit) {
        this.id_produit = id_produit;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Date getDate_vente() {
        return date_vente;
    }

    public void setDate_vente(Date date_vente) {
        this.date_vente = date_vente;
    }


}
