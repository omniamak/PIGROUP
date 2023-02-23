/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosit;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author iskander
 */
public class GestionEtudiant implements IUniversity{
    
    private ArrayList<Etudiant> list = new ArrayList<>();
    private String nom;

    public GestionEtudiant(String nom) {
        this.nom = nom;
    }
    
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
        list.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return list.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (int i = 0; i < list.size(); i++) {
            Etudiant et = list.get(i);

            if (et.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        list.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (int i = 0; i < list.size(); i++) {
            Etudiant et = list.get(i);
            System.out.println(et);
        }

//        for(Etudiant et:list){
//            System.out.println(et);
//        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(list);//comparable
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(list,new TriParNom());
    }
    
    
}
