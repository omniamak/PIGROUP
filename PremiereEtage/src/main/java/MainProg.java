/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public class MainProg {
    public static void main(String[] args){
        Client cl1 = new Client( 1 , "Ali");
        Clientparticulier cp1 = new Clientparticulier(2, "Med", 9999999);
        ClientLocal cli1 = new ClientLocal(3, "med", "001AL","Ariana");
        ClientEntreprise ce1 = new ClientEntreprise(4,"Salah", "AA001");
        
        cl1.acheter();
        cp1.acheter();
        cli1.acheter();
        ce1.acheter() ;
        
        Client cl2 = new ClientLocal (5, "Ahmed", "11AAW", "manouba");
        cl2.acheter();
        ((ClientEntreprise)cl2).payerFacture();
        ((ClientLocal)cl2).CalculerTVA();
        
        
        ClientEntreprise cl3 = new ClientLocal (6, "Ahmed", "11AAW", "manouba");
        cl3.acheter();
        cl3.payerFacture();
        ClientLocal cli2 = (ClientLocal)cl3;
        cli2.CalculerTVA();
        Client[] Clients = {cl1, cp1, ce1};
        for(int i=0; i < Clients.length; i++){
            if(Clients[i] instanceof Client){
                Clients[i].acheter();
            } else if(Clients[i] instanceof Clientparticulier){
                Clients[i].acheter();
 } else if(Clients[i] instanceof ClientEntreprise){
     ((ClientEntreprise)Clients[i]).payerFacture();
            }
            
        }
        
        
    
}
}
