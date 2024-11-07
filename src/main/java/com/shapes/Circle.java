package com.shapes;

import com.pluralsight.MainApp;
import com.pluralsight.Turtle;

import java.awt.*;

public class Circle extends Shape{
    public Circle(Turtle turtle, Point location, Color color, double border) {
        super(turtle, location, color, border);
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

        for (int i = 0; i < 36; i++) {
            turtle.forward(10);
            turtle.turnRight(10);
        }



    }
}
