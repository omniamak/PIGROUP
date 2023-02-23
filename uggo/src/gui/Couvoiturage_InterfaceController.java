/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import tn.esprit.entities.Covoiturage;
import tn.esprit.services.CovoiturageService;

/**
 * FXML Controller class
 *
 * @author Omnya
 */
public class Couvoiturage_InterfaceController implements Initializable {

    @FXML
    private ListView<Covoiturage> couvoiturages;
    @FXML
    private TextField adresse_depart;
    @FXML
    private TextField adreese_arrive;
    @FXML
    private DatePicker date_depart;
    @FXML
    private ComboBox<String> heure_depart;
    @FXML
    private TextField nbr_places;
    @FXML
    private TextField prix;
    @FXML
    private TextArea description;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        couvoiturages.getItems().setAll(new CovoiturageService().afficher());
    }    

    @FXML
    private void ajouter(ActionEvent event) {
        
    }
    
}
