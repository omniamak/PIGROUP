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
public class Mission {
        private int id_mission;

    @Override
    public String toString() {
        return "Mission{" + "id_mission=" + id_mission + ", date_livrison=" + date_livrison + ", solde_livrison=" + solde_livrison + ", id_livreur=" + id_livreur  + ", id_colis=" + id_colis + '}';
    }
    private Date date_livrison;
    private int solde_livrison;
    private int id_livreur; 
    private int id_colis;

    public Mission(int id_mission, Date date_livrison, int solde_livrison, int id_livreur, int id_colis) {
        this.id_mission = id_mission;
        this.date_livrison = date_livrison;
        this.solde_livrison = solde_livrison;
        this.id_livreur = id_livreur;
        this.id_colis = id_colis;
    }

    public Mission(Date date_livrison, int solde_livrison, int id_livreur, int id_colis) {
        this.date_livrison = date_livrison;
        this.solde_livrison = solde_livrison;
        this.id_livreur = id_livreur;
        this.id_colis = id_colis;
    }

    public int getId_mission() {
        return id_mission;
    }

    public void setId_mission(int id_mission) {
        this.id_mission = id_mission;
    }

    public Date getDate_livrison() {
        return date_livrison;
    }

    public void setDate_livrison(Date date_livrison) {
        this.date_livrison = date_livrison;
    }

    public int getSolde_livrison() {
        return solde_livrison;
    }

    public void setSolde_livrison(int solde_livrison) {
        this.solde_livrison = solde_livrison;
    }

    public int getId_livreur() {
        return id_livreur;
    }

    public void setId_livreur(int id_livreur) {
        this.id_livreur = id_livreur;
    }

    public int getId_colis() {
        return id_colis;
    }

    public void setId_colis(int id_colis) {
        this.id_colis = id_colis;
    }
    

}
