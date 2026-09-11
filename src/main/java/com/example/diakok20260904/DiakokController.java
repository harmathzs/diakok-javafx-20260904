package com.example.diakok20260904;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.PrintWriter;
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
    public Button btn_1996;
    @FXML
    public Button btn_10a;
    @FXML
    public Button btn_save;

    private Students students;

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
        if (!DiakokAppTest.isRunningTest) listview.setItems(observableList);
    }

    public void onSandorokButtonClick(ActionEvent actionEvent) {
        List<String> listviewContents = new ArrayList<String>();
        for (Student student: students.getStudents()) {
            if (student.getKnev().equals("Sándor")) {
                listviewContents.add(student.toString());
            }
        }
        ObservableList<String> observableList = FXCollections.observableList(listviewContents);
        if (!DiakokAppTest.isRunningTest) listview.setItems(observableList);
    }

    public void onKecskemetiButtonClick(ActionEvent actionEvent) {
        List<String> listviewContents = new ArrayList<String>();
        for (Student student: students.getStudents()) {
            if (student.getLakhely().equals("Kecskemét")) {
                listviewContents.add(student.toString());
            }
        }
        ObservableList<String> observableList = FXCollections.observableList(listviewContents);
        if (!DiakokAppTest.isRunningTest) listview.setItems(observableList);
    }

    public void on1996ButtonClick(ActionEvent actionEvent) {
        List<String> listviewContents = new ArrayList<String>();
        for (Student student: students.getStudents()) {
            if (student.getDatum().startsWith("1996")) {
                listviewContents.add(student.toString());
            }
        }
        ObservableList<String> observableList = FXCollections.observableList(listviewContents);
        if (!DiakokAppTest.isRunningTest) listview.setItems(observableList);
    }

    public void on10aButtonClick(ActionEvent actionEvent) {
        List<String> listviewContents = new ArrayList<String>();
        for (Student student: students.getStudents()) {
            if (student.getOsztaly().equals("10/A")) {
                listviewContents.add(student.toString());
            }
        }
        ObservableList<String> observableList = FXCollections.observableList(listviewContents);
        if (!DiakokAppTest.isRunningTest) listview.setItems(observableList);
    }

    public void onSaveButtonClick(ActionEvent actionEvent) {
        String[] listviewContents = new String[students.getStudents().length];
        for (int i=0; i<students.getStudents().length; i++) {
            listviewContents[i] = students.getStudents()[i].toString();
        }

        // formázott kiírás:
        try {
            if (!DiakokAppTest.isRunningTest) {
                PrintWriter pw = new PrintWriter("adatok.txt");
                for (String line: listviewContents) {
                    pw.println(line);
                }
                pw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}