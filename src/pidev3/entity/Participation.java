/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev3.entity;

/**
 *
 * @author Pc
 */
public class Participation {
    private int id_participation;
    private int couvoiturage_id;
    private int passager_id;
    private String nom;
    private int nombre_place;
    private String adresse_arrive;
    private String adresse_depart;
    private String mail;

    public Participation(int couvoiturage_id, int passager_id, String nom, int nombre_place, String adresse_arrive, String adresse_depart, String mail) {
        this.couvoiturage_id = couvoiturage_id;
        this.passager_id = passager_id;
        this.nom = nom;
        this.nombre_place = nombre_place;
        this.adresse_arrive = adresse_arrive;
        this.adresse_depart = adresse_depart;
        this.mail = mail;
    }

    public Participation(int id_participation, int couvoiturage_id, int passager_id, String nom, int nombre_place, String adresse_arrive, String adresse_depart, String mail) {
        this.id_participation = id_participation;
        this.couvoiturage_id = couvoiturage_id;
        this.passager_id = passager_id;
        this.nom = nom;
        this.nombre_place = nombre_place;
        this.adresse_arrive = adresse_arrive;
        this.adresse_depart = adresse_depart;
        this.mail = mail;
    }

    public int getId_participation() {
        return id_participation;
    }

    public void setId_participation(int id_participation) {
        this.id_participation = id_participation;
    }

    public int getCouvoiturage_id() {
        return couvoiturage_id;
    }

    public void setCouvoiturage_id(int couvoiturage_id) {
        this.couvoiturage_id = couvoiturage_id;
    }

    public int getPassager_id() {
        return passager_id;
    }

    public void setPassager_id(int passager_id) {
        this.passager_id = passager_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombre_place() {
        return nombre_place;
    }

    public void setNombre_place(int nombre_place) {
        this.nombre_place = nombre_place;
    }

    public String getAdresse_arrive() {
        return adresse_arrive;
    }

    public void setAdresse_arrive(String adresse_arrive) {
        this.adresse_arrive = adresse_arrive;
    }

    public String getAdresse_depart() {
        return adresse_depart;
    }

    public void setAdresse_depart(String adresse_depart) {
        this.adresse_depart = adresse_depart;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Participation{" + "id_participation=" + id_participation + ", couvoiturage_id=" + couvoiturage_id + ", passager_id=" + passager_id + ", nom=" + nom + ", nombre_place=" + nombre_place + ", adresse_arrive=" + adresse_arrive + ", adresse_depart=" + adresse_depart + ", mail=" + mail + '}';
    }
    
}
