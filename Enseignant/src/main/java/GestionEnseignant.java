/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public interface GestionEnseignant {
public void ajouterEnseignant(enseignant e);
public boolean rechercherEnseignant (enseignant e);
public boolean rechercherEnseignant (int id);
public void supprimerEnseignant (enseignant e);
public void displayEnseignants();

}
