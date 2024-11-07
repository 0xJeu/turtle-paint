package com.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle(Turtle turtle, Point location, Color color, double border) {
        super(turtle, location, color, border);
    }

    @Override
    public void paint() {

        int width = 50;
        int height = 50;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);

        turtle.setPenWidth(border);
        turtle.penUp();
        turtle.setColor(color);
        turtle.goTo(location);

        turtle.penDown();
        turtle.turnRight(120);
        turtle.forward(hypotenuse);
        turtle.turnLeft(120);
        turtle.forward(hypotenuse);
        turtle.turnLeft(120);
        turtle.forward(hypotenuse);


    }
}
