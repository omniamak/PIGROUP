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
import static javax.swing.UIManager.getString;
import pidev3.entity.Participation;
import pidev3.util.MaConnection;

/**
 *
 * @author Pc
 */
public class ParticipationService implements InterfaceService<Participation>{
        private final Connection cnx = MaConnection.getInstance().getCnx();

    @Override
    public void ajouter(Participation participation) {
       try{
            PreparedStatement ps = cnx.prepareStatement("INSERT INTO PARTICIPATION (id_passager,id_covoiturage,nom_participant,nombre_place,adresse_arrive,adress_depart,mail ) values (?,?,?,?,?,?,?)");
            ps.setInt(2,participation.getCouvoiturage_id());
            ps.setInt(1,participation.getPassager_id());
            ps.setString(3,participation.getNom());
            ps.setInt(4,participation.getNombre_place());
            ps.setString(5,participation.getAdresse_arrive());
            ps.setString(6,participation.getAdresse_depart());
            ps.setString(7,participation.getMail());


            ps.executeUpdate();
        }catch (Exception ignored){
            System.out.println(ignored.getMessage());
        }    }

    @Override
    public void modifier(Participation participation) {
         try{
            PreparedStatement ps = cnx.prepareStatement("UPDATE PARTICIPATION SET id_passager = ? ,id_covoiturage = ?, nom_participant  = ?,nombre_place = ?,adresse_arrive = ?,adress_depart = ?,mail = ? WHERE id_participation = ?");
            ps.setInt(2,participation.getCouvoiturage_id());
            ps.setInt(1,participation.getPassager_id());
            ps.setInt(3,participation.getId_participation());
            ps.setString(8,participation.getNom());
            ps.setInt(4,participation.getNombre_place());
            ps.setString(5,participation.getAdresse_arrive());
            ps.setString(6,participation.getAdresse_depart());
            ps.setString(7,participation.getMail());


            ps.executeUpdate();
        }catch (Exception ignored){
            System.out.println(ignored.getMessage());
                    

        }
    }

    @Override
    public List<Participation> afficher() {
        try{
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM PARTICIPATION WHERE 1");
            List<Participation> participations = new ArrayList<>();
            while(rs.next()){
               participations.add(new Participation(rs.getInt(1), rs.getInt(2), rs.getString(3) , rs.getInt(4),rs.getString (5),rs.getString(6),rs.getString(7)));
            }
            return participations;
        }catch(Exception ignored){
            return null;
        }
    }

    @Override
    public void supprimer(Participation participation) {
        try{
            PreparedStatement ps = cnx.prepareStatement("DELETE FROM PARTICIPATION WHERE id_participation = ?");
            ps.setInt(1,participation.getId_participation());
            ps.executeUpdate();
        }catch (Exception ignored){

        }
    }

}
