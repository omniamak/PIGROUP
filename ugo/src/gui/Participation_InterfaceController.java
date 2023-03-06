/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 * FXML Controller class
 *
 * @author Omnya
 */
public class Participation_InterfaceController implements Initializable {

    @FXML
    private TextField trajet;
    @FXML
    private Line ligne;
    @FXML
    private Circle cercle1;
    @FXML
    private Circle cercle2;
    @FXML
    private TextField place;
    @FXML
    private TextField prix_place;
    @FXML
    private Button ajouter_participation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
