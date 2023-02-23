/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapprosit;

/**
 *
 * @author Omnya
 */
public class SocieteTreeMap implements InterfaceSociete {
    Map<Employe, departement> tmap = new TreeMap(new TriParMatricule());
    public SocieteTreeMap(){
  Map<Employe,departement> tmap = new TreeMap(new TriParMatricule());      
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, departement d) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void supprimerEmploye(Employe e) {
        throw new UnsupportedOperationException("Not supported yet.");  }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for(Employe employe : tmap.keySet ()); }

    @Override
    public void afficherLesEmployes() {
        throw new UnsupportedOperationException("Not supported yet."); }

    @Override
    public void afficherLesDepartements() {
        throw new UnsupportedOperationException("Not supported yet."); }

    @Override
    public void afficherDepartement(Employe e) {
        throw new UnsupportedOperationException("Not supported yet.");  }

    @Override
    public boolean rechercherEmploye(Employe e) {
        throw new UnsupportedOperationException("Not supported yet.");}

    @Override
    public boolean rechercherDepartement(departement e) {
        throw new UnsupportedOperationException("Not supported yet."); }
    
}
