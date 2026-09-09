package com.example.diakok20260904;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DiakokController implements Initializable {
    @FXML
    public Button btn_mindenki;
    @FXML
    public ListView<String> listview;
    @FXML
    public Button btn_sandorok;
    @FXML
    public Button btn_kecskemeti;
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
        students.loadFromFile("diakok.csv");
    }

    public void onMindenkiButtonClick(ActionEvent actionEvent) {
        String[] listviewContents = new String[students.getStudents().length];
        for (int i=0; i<students.getStudents().length; i++) {
            listviewContents[i] = students.getStudents()[i].toString();
        }
        ObservableList<String> observableList = FXCollections.observableArrayList(listviewContents);
        listview.setItems(observableList);
    }

    public void onSandorokButtonClick(ActionEvent actionEvent) {
        List<String> listviewContents = new ArrayList<String>();
        for (Student student: students.getStudents()) {
            if (student.getKnev().equals("Sándor")) {
                listviewContents.add(student.toString());
            }
        }
        ObservableList<String> observableList = FXCollections.observableList(listviewContents);
        listview.setItems(observableList);
    }

    public void onKecskemetiButtonClick(ActionEvent actionEvent) {
        List<String> listviewContents = new ArrayList<String>();
        for (Student student: students.getStudents()) {
            if (student.getLakhely().equals("Kecskemét")) {
                listviewContents.add(student.toString());
            }
        }
        ObservableList<String> observableList = FXCollections.observableList(listviewContents);
        listview.setItems(observableList);
    }
}