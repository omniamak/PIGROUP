/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Omnya
 */
public class Client {
    private int id ;
    protected String nom;
    public int age;
    
    public Client (int id, String nom){
        this.id = id;
        this.nom = nom;
    }
    public void acheter() {
        System.out.println("j'achete");
    }
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        /*if(!(obj instanceof Client))
            return false;*/
        if(this.getClass() != obj.getClass())
            return false;
        final Client other = (Client)obj;
        if(this.id != other.getId())
            return false;
        if(this.nom.equals(other.nom))
            return false;
        return true;
    }
    public int getId(){ 
        return id;
    }
    public String toString(){
        return"id=" + id + ", nom" + ", age=" + age;
    }
}
