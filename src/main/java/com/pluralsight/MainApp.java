package com.pluralsight;

import com.shapes.Circle;
import com.shapes.Square;
import com.shapes.Triangle;

import java.awt.*;
import java.awt.geom.Point2D;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World();
        Turtle turtle = new Turtle(world,0, 0);

//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(50, -50);
////        turtle.turnRight(45);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);

        Point location = new Point(50, 50);

        Square square = new Square(turtle, location, Color.RED, 10);

//        square.paint();

        Point location2 = new Point(100, -100);
        Triangle triangle = new Triangle(turtle, location2, Color.GREEN, 10);

//        triangle.paint();

        Point location3 = new Point(-20, -20);

        Circle circle = new Circle(turtle, location3, Color.ORANGE, 10);

        circle.paint();


    }
}
