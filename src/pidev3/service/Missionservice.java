/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev3.entity.Mission;
import pidev3.util.MaConnection;

/**
 *
 * @author Pc
 */
public class Missionservice implements InterfaceService<Mission> {
    private final Connection cnx = MaConnection.getInstance().getCnx();

    @Override
    public void ajouter(Mission t) {
                     try{
            PreparedStatement ps = cnx.prepareStatement("INSERT INTO MISSION (date_livraison,solde_livraison,id_livreur,id_colis) values (?,?,?,?)");
            ps.setDate(1,t.getDate_livrison());
            ps.setInt(2,t.getSolde_livrison());
            ps.setInt(3,t.getId_livreur());
            ps.setInt(4,t.getId_colis());
            ps.executeUpdate();
                 System.out.println("mission ajout avec succes");
        }catch(Exception ignored){
                 System.out.println(ignored.getMessage());
        }


    }

    @Override
    public void modifier(Mission t) {
        try{
            PreparedStatement ps = cnx.prepareStatement("UPDATE MISSION set date_livrison = ? , solde_livrison = ? , id_livreur = ?  , id_colis = ?  where id_mission = ?");
            ps.setDate(1,t.getDate_livrison());
            ps.setInt(2,t.getSolde_livrison());
            ps.setInt(3,t.getId_livreur());
            ps.setInt(4,t.getId_colis());
            ps.setInt(5,t.getId_mission());

            ps.executeUpdate();
        }catch(Exception ignored){
    }
    }

    @Override
    public List<Mission> afficher() {
try{
            Statement st =  cnx.createStatement();
            ResultSet rs = st.executeQuery("select * from mission ");
            List<Mission> liste_Mission = new ArrayList<>();
            while(rs.next()){
                liste_Mission.add(new Mission(rs.getInt(1), rs.getDate(2), rs.getInt(3) , rs.getInt(4),rs.getInt(5)));
            }
            System.out.println(liste_Mission);
            return liste_Mission;
        }catch(Exception ignored){
            
            System.out.println(ignored.getMessage());
            return null;
        }
    }

    @Override
    public void supprimer(Mission t) {
              try{
            PreparedStatement ps = cnx.prepareStatement("DELETE FROM MISSION WHERE id_mission  = ?");
            ps.setInt(1,t.getId_mission());
            ps.executeUpdate();
        }catch(Exception ignored){
            
        }
    }
    
}
