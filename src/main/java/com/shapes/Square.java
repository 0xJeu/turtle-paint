package com.shapes;

import com.pluralsight.Turtle;

import java.awt.*;
import java.awt.geom.Point2D;

public class Square extends Shape{
    public Square(Turtle turtle, Point location, Color color, double border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {
        turtle.setPenWidth(border);
        turtle.setColor(color);
        turtle.penUp();

        turtle.goTo(location);
        turtle.penDown();
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnRight(90);
        turtle.forward(100);
        turtle.turnRight(90);




    }
}
