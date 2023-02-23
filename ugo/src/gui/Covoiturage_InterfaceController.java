/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import tn.esprit.entities.Covoiturage;
import tn.esprit.services.CovoiturageService;

/**
 *
 * @author Omnya
 */
public class Covoiturage_InterfaceController implements Initializable{
    private ListView<Covoiturage> couvoiturages;
    private TextField adresse_depart;
    private TextField adreese_arrive;
    private DatePicker date_depart;
    private ComboBox<String> heure_depart;
    private TextField nbr_places;
    private TextField prix;
    private TextArea description;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        couvoiturages.getItems().setAll(new CovoiturageService().afficher());
    }    

    private void ajouter(ActionEvent event) {
               Covoiturage c = new Covoiturage(adresse_depart.getText(),adreese_arrive.getText(),date_depart.getValue().toString(),heure_depart.getSelectionModel().getSelectedItem(),Integer.parseInt(nbr_places.getText()),Float.parseFloat(prix.getText()),description.getText());
        new CovoiturageService().ajouter(c);
        new Alert(Alert.AlertType.CONFIRMATION,"Colis ajouté avec succéss ",ButtonType.OK).show();

    }
    
    
    
}
