package com.uacam.tinder.tinder;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tinder");
        Navegacion.setPrimaryStage(primaryStage);
        Navegacion.loadView("/com/uacam/tinder/tinder/views/AvisoPrivacidadView.fxml");
    }

    public static void main(String[] args) {
        launch(args);
    }
}