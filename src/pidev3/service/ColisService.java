/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pidev3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev3.entity.Colis;
import pidev3.util.MaConnection;

/**
 *
 * @author Pc
 */
public class ColisService implements InterfaceService<Colis>{
    private final Connection cnx = MaConnection.getInstance().getCnx();
    @Override
    public void ajouter(Colis t) {
        try{
            PreparedStatement ps = cnx.prepareStatement("INSERT INTO COLIS (categorie,poids,adrees_depart,adress_arrive,id_user,num_des) values (?,?,?,?,?,?)");
            ps.setString(1,t.getCategorie());
            ps.setInt(2,t.getPoids());
            ps.setString(3,t.getAdress_depart());
            ps.setString(4,t.getAdress_arrive());
            ps.setInt(5,t.getId_user());
            ps.setInt(6,t.getNum_des());



            ps.executeUpdate();
            System.out.println("colis ajout avec succes");

        }catch(Exception ignored){
            System.out.println(ignored.getMessage());
        }
    }

    @Override
    public void modifier(Colis t) {
        try{
            PreparedStatement ps = cnx.prepareStatement("UPDATE COLIS set categorie = ? , poids = ?, , adress_depart = ?, adress_arrive = ?, num_des = ? , id_user = ? where id_Colis = ?");
            ps.setString(1,t.getCategorie());
            ps.setInt(2,t.getPoids());
            ps.setString(3,t.getAdress_depart());
            ps.setString(4,t.getAdress_arrive());
            ps.setInt(6,t.getId_user());
            ps.setInt(5,t.getId_colis());

            ps.setInt(7,t.getId_colis());
            ps.executeUpdate();
        }catch(Exception ignored){
            
        }
    }

    @Override
    public List<Colis> afficher() {
        try{
            Statement st =  cnx.createStatement();
            ResultSet rs = st.executeQuery("select * from colis ");
            List<Colis> liste_Colis = new ArrayList<>();
            while(rs.next()){
                liste_Colis.add(new Colis(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),rs.getString(5),rs.getString(6) , rs.getInt(7)));
            }
            return liste_Colis;
        }catch(Exception ignored){
            return null;
        }
    }

    @Override
    public void supprimer(Colis t) {
        try{
            PreparedStatement ps = cnx.prepareStatement("DELETE FROM COLIS WHERE id_colis  = ?");
            ps.setInt(1,t.getId_colis());
            ps.executeUpdate();
        }catch(Exception ignored){
            
        }
    }
    
}
