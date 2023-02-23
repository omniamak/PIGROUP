/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prositset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author iskander
 */
public class EspritTreeSet implements GestionEnseignant{
    
    Set<Enseignant> ets;
    public EspritTreeSet() {
        ets =new TreeSet<>();
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        ets.add(e);
        
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return ets.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant e : ets){
            if(e.getId()==id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        ets.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e : ets){
            System.out.println(e);
        }
    }
    
}
