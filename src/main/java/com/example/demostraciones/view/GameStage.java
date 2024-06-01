package com.example.demostraciones.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameStage extends Stage {
    private GameStage gameStage;
    public GameStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demostraciones/game-view.fxml"));
        Parent root=loader.load();
        setTitle("Game Stage");
        Scene scene = new Scene(root);
        setScene(scene);
        show();
    }
    private static class GameStageHolder{
        private static GameStage INSTANCE;
    }
    public static GameStage getInstance() throws IOException {
        return GameStageHolder.INSTANCE=new GameStage();
    }

    public static void deleteInstance(){
        GameStageHolder.INSTANCE.close();
        GameStageHolder.INSTANCE=null;
    }
}
