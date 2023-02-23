
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public class enseignant {
    private int id;
    private String nom ;
    private String prenom ;
    public enseignant (){}
    public enseignant(int id, String nom,String prenom ){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
   

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final enseignant other = (enseignant) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.prenom, other.prenom);
    }

    @Override
    public String toString() {
        return "enseignant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
   
    
}
