/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosit;

/**
 *
 * @author iskander
 */
public class MainProg {
    
 public static void main(String[] args) {
       
        GestionEtudiant gest1 = new GestionEtudiant("3A40");

        Etudiant et1 = new Etudiant(1, "ali", "arfeoui");
        Etudiant et2 = new Etudiant(2, "iskander", "guedri");
        Etudiant et3 = new Etudiant(3, "manaii", "Syrine");
        Etudiant et4 = new Etudiant(5, "maktouf", "omnia");

        gest1.ajouterEtudiant(et1);
        gest1.ajouterEtudiant(et2);
        gest1.ajouterEtudiant(et3);
        gest1.ajouterEtudiant(et4);

        gest1.displayEtudiants();

        System.out.println("recherche 1 " +gest1.rechercherEtudiant(et1));
        System.out.println("recherche2 " +gest1.rechercherEtudiant(et4));

        System.out.println("recherche3 " +gest1.rechercherEtudiant(new Etudiant(2, "guedri", "iskander")));

        gest1.supprimerEtudiant(et4);
        gest1.ajouterEtudiant(et4);
        gest1.displayEtudiants();
        gest1.trierEtudiantsParNom();
        System.out.println("apres tri");
        gest1.displayEtudiants();
    }

}
