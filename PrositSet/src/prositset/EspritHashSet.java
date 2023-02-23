/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prositset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author iskander
 */
public class EspritHashSet implements GestionEnseignant {

    Set<Enseignant> hashetEsprit;
    public EspritHashSet() {
        hashetEsprit =new HashSet<>();
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        hashetEsprit.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hashetEsprit.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e : hashetEsprit){
            if(e.getId()==id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) { 
        hashetEsprit.remove(e);    
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e : hashetEsprit){
            System.out.println(e);
        }
        
    }
    
}
