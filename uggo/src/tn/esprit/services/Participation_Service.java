/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.esprit.services;

/**
 *
 * @author Omnya
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tn.esprit.entities.Participation;
import tn.esprit.utils.MaConnection;

public class Participation_Service implements InterfaceService<Participation>{
    private final Connection cnx = MaConnection.getInstance().getCnx();
    @Override
    public void ajouter(Participation participation) {
        try{
            PreparedStatement ps = cnx.prepareStatement("INSERT INTO PARTICIPATION couvoiturage_id,passager_id,date_participation values (?,?,?)");
            ps.setInt(1,participation.getCouvoiturage_id());
            ps.setInt(2,participation.getPassager_id());
            ps.setString(3,participation.getDate_participation());
            ps.executeUpdate();
        }catch (Exception ignored){

        }
    }

    @Override
    public void supprimer(Participation participation) {
        try{
            PreparedStatement ps = cnx.prepareStatement("DELETE FROM PARTICIPATION WHERE ID = ?");
            ps.setInt(1,participation.getId());
            ps.executeUpdate();
        }catch (Exception ignored){

        }
    }

    @Override
    public void modifier(Participation participation) {
        try{
            PreparedStatement ps = cnx.prepareStatement("UPDATE PARTICIPATION SET couvoiturage_id = ?,passager_id= ?,date_participation =? where id = ?");
            ps.setInt(1,participation.getCouvoiturage_id());
            ps.setInt(2,participation.getPassager_id());
            ps.setString(3,participation.getDate_participation());
            ps.setInt(4,participation.getId());
            ps.executeUpdate();
        }catch (Exception ignored){

        }
    }

    @Override
    public List<Participation> afficher() {
        try{
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM PARTICIPATION WHERE ID = ?");
            List<Participation> participations = new ArrayList<>();
            while(rs.next()){
                participations.add(new Participation(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4)));
            }
            return participations;
        }catch(Exception ignored){
            return null;
        }
    }
}