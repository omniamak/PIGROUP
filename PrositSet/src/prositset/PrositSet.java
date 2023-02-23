/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prositset;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author iskander
 */
public class PrositSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EspritHashSet ehs=new EspritHashSet();
        Enseignant en1=new Enseignant(5,"Kassem","yassine");
        Enseignant en2=new Enseignant(1,"almi","rayen");
        Enseignant en3=new Enseignant(3,"masmoudi","oussema");
        
        ehs.ajouterEnseignant(en1);
        ehs.ajouterEnseignant(en2);
        ehs.ajouterEnseignant(en3);
        
        ehs.displayEnseignants();
        
        System.out.println(ehs.rechercherEnseignant(en1));     
        System.out.println(ehs.rechercherEnseignant(en2)); 
        System.out.println(ehs.rechercherEnseignant(new Enseignant(4,"ahmed","ahmed")));
        
        System.out.println(ehs.rechercherEnseignant(3));
        
        ehs.supprimerEnseignant(en3);
        ehs.displayEnseignants();
        
        System.out.println("------------------------------------------------------------------------");
        EspritTreeSet ets =new EspritTreeSet();
        ets.ajouterEnseignant(en1);
        ets.ajouterEnseignant(en2);
        ets.ajouterEnseignant(en3);
        
        ets.displayEnseignants();
        System.out.println("------------------------------------------------------------------------");
        
    }
    
}
