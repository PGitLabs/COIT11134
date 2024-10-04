/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.week8project;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author psaga
 */
public class CQUClinicFXMLController implements Initializable {

    ArrayList<Patient> pList = new ArrayList<>();

    @FXML
    private Button btnAdd;
    @FXML
    private Button btnBack;
    @FXML
    private TextField txtPatientID;
    @FXML
    private TextField txtPatientName;
    @FXML
    private Button btnClear;
    @FXML
    private TextArea taDisplay;
    @FXML
    private Button btnShowAll;
    @FXML
    private Button btnResetList;
    @FXML
    private Button exitButton;

    @FXML
    private void addButtonAction(ActionEvent event) {
        int patientID = Integer.parseInt(this.txtPatientID.getText());
        String patientName = this.txtPatientName.getText();
        Patient p = new Patient(patientID, patientName);
        this.taDisplay.setText(p.toString() + " is added");
        pList.add(p);
    }

    @FXML
    private void resetList(ActionEvent event) {
        pList.clear();
        this.taDisplay.setText("All List Items Removed.");
    }
    
    @FXML
    private void backButtonAction(ActionEvent event) throws IOException {
        App.setRoot("CQUClinicFXML");
    }

    @FXML
    private void clearButtonAaction(ActionEvent event) {
        this.txtPatientID.setText("");
        this.txtPatientName.setText("");
        this.taDisplay.setText("");
    }

    @FXML
    private void showAllAction(ActionEvent event) {
        this.txtPatientID.setText("");
        this.txtPatientName.setText("");
        this.taDisplay.setText("");
        
        for (int i=0; i<pList.size(); i++) {
            this.taDisplay.appendText(pList.get(i).toString());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML
    private void exitButtonAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to Close?");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Platform.exit();
            }
        });
    }
}
