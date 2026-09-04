package com.example.diakok20260904;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DiakokController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}