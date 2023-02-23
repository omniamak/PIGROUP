/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public class ClientEntreprise extends Client {
    private String matricule;
 
    public ClientEntreprise(int id, String nom,String matricule) {
        super(id, nom);
        this.matricule = matricule;
    }
    public void payerFacture(){
        int idClient = getId();
        String nomClient=nom; //protected dans l'heritage devient public pas besion de getter
        int ageClient=age;
        System.out.println("Le client " + nomClient + " avec l'id" + idClient  + " age de " + ageClient + " a paye sa facture");
        System.out.println("j'ai une facture");
    }
    
    
}
