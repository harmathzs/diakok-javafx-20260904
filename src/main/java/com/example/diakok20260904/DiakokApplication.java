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
        FXMLLoader fxmlLoader = null;
        if (!DiakokTest.isRunningTest) fxmlLoader = new FXMLLoader(DiakokApplication.class.getResource("diakok-view.fxml"));
        Scene scene = null;
        if (!DiakokTest.isRunningTest) scene = new Scene(fxmlLoader.load(), 608, 366);
        if (!DiakokTest.isRunningTest) stage.setTitle("Diákok");
        if (!DiakokTest.isRunningTest) stage.setScene(scene);
        Image windowIconImage = null;
        if (!DiakokTest.isRunningTest) windowIconImage = new Image("file:icons/diak.png");
        if (!DiakokTest.isRunningTest) stage.getIcons().add(windowIconImage);
        if (!DiakokTest.isRunningTest) stage.show();
    }

    public static void main(String[] args) {
        if (!DiakokTest.isRunningTest) launch();
    }
}