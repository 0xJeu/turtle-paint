package com.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Hexagon extends Shape {
    public Hexagon(Turtle turtle, Point location, Color color, double border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        turtle.setPenWidth(border);
        turtle.penUp();
        turtle.setColor(color);
        turtle.goTo(location);

        turtle.penDown();
        for (int i = 0; i < 6; i++) {
            turtle.forward(100);
            turtle.turnRight(60);
        }



    }
}
