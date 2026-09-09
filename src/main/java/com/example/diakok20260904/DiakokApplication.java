package com.example.diakok20260904;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class DiakokApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DiakokApplication.class.getResource("diakok-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 608, 366);
        stage.setTitle("Diákok");
        stage.setScene(scene);
        Image windowIconImage = new Image("file:icons/diak.png");
        stage.getIcons().add(windowIconImage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}