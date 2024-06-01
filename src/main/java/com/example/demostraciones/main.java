package com.example.demostraciones;

import com.example.demostraciones.view.GameStage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        GameStage.getInstance();
    }
}
