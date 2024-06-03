package com.example.demostraciones.model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Boats {

    private Rectangle boat1;

    public Boats() {
        boat1 = new Rectangle(100,50, Color.LAVENDER);
        boat1.setStroke(Color.BLACK);
        boat1.setLayoutX(100);
        boat1.setLayoutY(100);

    }
    public Rectangle getBoat1() {
        return boat1;
    }
    public void setBoat1(Rectangle boat1) {
        this.boat1 = boat1;
    }
}
