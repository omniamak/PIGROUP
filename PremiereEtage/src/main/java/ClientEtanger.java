/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public class ClientEtanger extends ClientEntreprise {
    private String pays;
    public ClientEtanger(int id, String nom, String matricule,String pays){
        super(id,nom,matricule);
        this.pays = pays;
    }
    
    
}
