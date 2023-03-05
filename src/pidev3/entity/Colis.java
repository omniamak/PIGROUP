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
public class Colis {
        public int id_colis	;
    public String categorie;
    public int poids ;
public String adress_depart;
public String adress_arrive;
public int id_user;
public int num_des;


    public Colis(int id_colis, String categorie, int poids,int id_user , String adress_depart, String adress_arrive, int num_des ) {
        this.id_colis = id_colis;
        this.categorie = categorie;
        this.poids = poids;
        this.id_user = id_user;
        this.adress_depart = adress_depart;
        this.adress_arrive = adress_arrive;
        this.num_des = num_des;
       
    }

    public Colis(String categorie, int poids, String adress_depart, String adress_arrive, int id_user , int num_des ) {
        this.categorie = categorie;
        this.poids = poids;
        this.adress_depart = adress_depart;
        this.adress_arrive = adress_arrive;
        this.id_user = id_user;
        this.num_des = num_des;

    }

    public int getNum_des() {
        return num_des;
    }

    public void setNum_des(int num_des) {
        this.num_des = num_des;
    }

    public int getId_colis() {
        return id_colis;
    }

    public void setId_colis(int id_colis) {
        this.id_colis = id_colis;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getAdress_depart() {
        return adress_depart;
    }

    public void setAdress_depart(String adress_depart) {
        this.adress_depart = adress_depart;
    }

    public String getAdress_arrive() {
        return adress_arrive;
    }

    public void setAdress_arrive(String adress_arrive) {
        this.adress_arrive = adress_arrive;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
        @Override
    public String toString() {
        return "Colis{ categorie=" + categorie + ", poids=" + poids + '}';
    }


    
}
