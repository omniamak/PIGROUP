/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.esprit.entities;

/**
 *
 * @author Omnya
 */
public class Participation {
    private int id;
    private int couvoiturage_id;
    private int passager_id;
    private String date_participation;

    public Participation(int couvoiturage_id, int passager_id, String date_participation) {
        this.couvoiturage_id = couvoiturage_id;
        this.passager_id = passager_id;
        this.date_participation = date_participation;
    }

    public Participation(int id, int couvoiturage_id, int passager_id, String date_participation) {
        this.id = id;
        this.couvoiturage_id = couvoiturage_id;
        this.passager_id = passager_id;
        this.date_participation = date_participation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDate_participation() {
        return date_participation;
    }

    public void setDate_participation(String date_participation) {
        this.date_participation = date_participation;
    }

    @Override
    public String toString() {
        return "Participation{" +
                "id=" + id +
                ", couvoiturage_id=" + couvoiturage_id +
                ", passager_id=" + passager_id +
                ", date_participation='" + date_participation + '\'' +
                '}';
    }
}
