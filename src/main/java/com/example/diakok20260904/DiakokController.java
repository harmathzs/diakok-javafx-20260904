package com.example.diakok20260904;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DiakokController implements Initializable {
    @FXML
    private Label welcomeText;

    private Students students;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        students = new Students();
        students.loadFromFile("file:diakok.csv");
    }
}