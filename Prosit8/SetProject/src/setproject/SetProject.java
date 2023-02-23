/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setproject;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author 
 */
public class SetProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(2, "gharbi", "Mohamed");
        Etudiant e2 = new Etudiant(3, "aloui", "Jackson");
        Etudiant e3 = new Etudiant(252, "Ali", "manaaii");
        Etudiant e4 = new Etudiant(1, "Ali", "manaaii");

//        EspritHashSet ehs = new EspritHashSet();
//        ehs.ajouterEtudiant(e1);
//        ehs.ajouterEtudiant(e2);
//        ehs.ajouterEtudiant(e3);
//        ehs.displayEtudiants();
//        ehs.ajouterEtudiant(e4);
//        ehs.displayEtudiants();
//
//        System.out.println("PRESENCE PAR ID : " + ehs.rechercherEtudiant(1));

        EspritTreeSet ets = new EspritTreeSet();
        ets.ajouterEtudiant(e1);
        ets.ajouterEtudiant(e2);
        ets.ajouterEtudiant(e3);
        ets.displayEtudiants();
        ets.ajouterEtudiant(e4);
        ets.displayEtudiants();

        System.out.println("PRESENCE PAR ID : " + ets.rechercherEtudiant(1));

    }

}
