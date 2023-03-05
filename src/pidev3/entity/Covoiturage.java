/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev3.entity;
import java.sql.Date;

/**
 *
 * @author Pc
 */
public class Covoiturage {
     public int id_covoiturage;

    public String adresse_depart ;
    public String adresse_arrive ;
    public String date_depart ;
    public String  heure_depart;
    public int nb_place ;
    public float prix ;
    public String description;
    public int id_conducteur;

    public Covoiturage(String adresse_depart, String adresse_arrive, String date_depart, String heure_depart, int nb_place, float prix, String description) {
        this.adresse_depart = adresse_depart;
        this.adresse_arrive = adresse_arrive;
        this.date_depart = date_depart;
        this.heure_depart = heure_depart;
        this.nb_place = nb_place;
        this.prix = prix;
        this.description = description;
        this.id_conducteur = id_conducteur;
    }

    public Covoiturage(int id_covoiturage, String adresse_depart, String adresse_arrive, String date_depart, String heure_depart, int nb_place, float prix, String description, int id_conducteur) {
        this.id_covoiturage = id_covoiturage;
        this.adresse_depart = adresse_depart;
        this.adresse_arrive = adresse_arrive;
        this.date_depart = date_depart;
        this.heure_depart = heure_depart;
        this.nb_place = nb_place;
        this.prix = prix;
        this.description = description;
        this.id_conducteur = id_conducteur;
    }

    public Covoiturage(int aInt, String string, String string0, String string1, String string2, int aInt0, float aFloat, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_covoiturage() {
        return id_covoiturage;
    }

    public void setId_covoiturage(int id_covoiturage) {
        this.id_covoiturage = id_covoiturage;
    }

    public String getAdresse_depart() {
        return adresse_depart;
    }

    public void setAdresse_depart(String adresse_depart) {
        this.adresse_depart = adresse_depart;
    }

    public String getAdresse_arrive() {
        return adresse_arrive;
    }

    public void setAdresse_arrive(String adresse_arrive) {
        this.adresse_arrive = adresse_arrive;
    }

    public String getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

    public String getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_conducteur() {
        return id_conducteur;
    }

    public void setId_conducteur(int id_conducteur) {
        this.id_conducteur = id_conducteur;
    }

    @Override
    public String toString() {
        return "Covoiturage{" + "id_covoiturage=" + id_covoiturage + ", adresse_depart=" + adresse_depart + ", adresse_arrive=" + adresse_arrive + ", date_depart=" + date_depart + ", heure_depart=" + heure_depart + ", nb_place=" + nb_place + ", prix=" + prix + ", description=" + description + ", id_conducteur=" + id_conducteur + '}';
    }
    

    
}
