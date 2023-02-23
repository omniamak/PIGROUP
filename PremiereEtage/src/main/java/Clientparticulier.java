/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public class Clientparticulier extends Client {
    private int cin;
    
    
//par defaut
    public Clientparticulier(int id, String nom, int cin){
        super(id, nom); //en 1 ere
        this.cin = cin;
    }
    //redifinition d'une methode de las classe mere
    public void acheter(){
        super.acheter();
        System.out.println("j'achete en tant client particulier");
    }
    public String toString(){
        return super.toString() + ",cin=" +cin;
    }
   
}
