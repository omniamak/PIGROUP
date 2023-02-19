/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.esprit.tests;

import tn.esprit.entities.Covoiturage;
import tn.esprit.entities.Participation;
import tn.esprit.services.CovoiturageService;
import tn.esprit.services.ParticipationService;

/**
 *
 * @author Omnya
 */
public class Ugo {
    public static void main(String[] args) {
    CovoiturageService sp = new CovoiturageService();
        Covoiturage c =new Covoiturage("haaa","bardo","ytfd","HHHH",3, (float) 3.1,"salut");
        System.out.println(sp.afficher());
        //sp.modifier(12,"az", "Zaher", "Hamdi","qsd",123,(float) 3.5,"azer");
        //sp1.supprimer(new Personne(1));
        //System.out.println(sp1.afficher());
        sp.ajouter(c);
         ParticipationService sp1 = new ParticipationService();
        Participation participation  =new Participation(2,100,45);
        sp1.ajouter(participation);
        System.out.println(sp1.afficher());
        
        
        //sp.modifier(12,"az", "Zaher", "Hamdi","qsd",123,(float) 3.5,"azer");
        //sp1.supprimer(new Personne(1));
        //System.out.println(sp1.afficher());
        sp1.ajouter(participation);
}
        
    
}
