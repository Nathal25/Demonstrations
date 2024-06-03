package com.example.demostraciones.controller;


import com.example.demostraciones.model.Boats;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;

public class GameController {
    @FXML
    private AnchorPane anchorBase;

    private Polygon testFigure;

    private Boats boat;

    private double posMouseX,posMouseY;
    public void initialize(){
        testFigure = new Polygon(
            0,0,
                0,64,
                32,64,
                42,32
        );
        testFigure.setStyle("-fx-background-color: rgb(96,225,215);" +
                "-fx-border-color: rgb(1,1,1);" +
                "-fx-border-width: 2px;" +
                "-fx-stroke-type: INSIDE");
        testFigure.setLayoutX(50);
        testFigure.setLayoutY(50);
//        testFigure.setOnMouseClicked(event ->{
//            System.out.println("Se hizo clic en la figura");
//        });


        testFigure.setOnMousePressed(event ->{

            posMouseX = event.getSceneX()-testFigure.getLayoutX();
            posMouseY = event.getSceneY()-testFigure.getLayoutY();

            System.out.println("La posicion del mouse es: "+posMouseX +","+posMouseY);
        });

        //PARTE DOS
        testFigure.setOnMouseDragged(event ->{
            System.out.println("Se está arrastrando el mouse en la posición "+event.getSceneX() +","+ event.getSceneY());
            double newX = event.getSceneX() - posMouseX;
            double newY = event.getSceneY() - posMouseY;

            if (newX >= 0 && newX <= anchorBase.getWidth() - testFigure.getBoundsInParent().getWidth()) {
                testFigure.setLayoutX(newX);
            }
            if (newY >= 0 && newY <= anchorBase.getHeight() - testFigure.getBoundsInParent().getHeight()) {
                testFigure.setLayoutY(newY);
            }
        });
        testFigure.setOnMouseReleased(event->{
            System.out.println("Se liberó el mouse");
            posMouseX = 0;
            posMouseY = 0;
        });

        anchorBase.getChildren().add(testFigure);
    }
    @FXML
    void onHandleButtonClic(ActionEvent event) {
        event.getEventType();
       // boat = new Boats();
        try {
            anchorBase.getChildren().add(boat.getBoat1());
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
        System.out.println("Hola mundo!");
    }
}
