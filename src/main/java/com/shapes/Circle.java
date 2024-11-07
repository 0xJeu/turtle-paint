package com.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Circle extends Shape {

    private double radius;

    public Circle(Turtle turtle, Point location, Color color, double border, double radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {
        turtle.setPenWidth(border);
        turtle.penUp();
        turtle.setColor(color);
        turtle.goTo(location);

        //Area = PI *R * 2squared

        double pi = Math.PI;
        double area = Math.pow(pi * 5, 2);

        turtle.penDown();

        // Need to sub 10 with the user's radius
        for (int i = 0; i < 36; i++) {
            turtle.forward(radius);
            turtle.turnRight(10);
        }


    }
}
