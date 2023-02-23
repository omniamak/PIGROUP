/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public class ClientLocal extends ClientEntreprise {
    private String gov;
    public ClientLocal(int id, String nom, String matricule, String gov){
        super(id, nom, matricule);
        this.gov = gov;
        
    }
    public  void CalculerTVA(){
        System.out.println("Calculer TVA");
    }
        //redefinition d'une methode
    public void acheter(){
        System.out.println("j'achete en tant client local");
    }
        //surcharge
    public void acheter( String mag){
        System.out.println(mag);
    }
    
}
