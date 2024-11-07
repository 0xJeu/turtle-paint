package com.shapes;

import java.awt.*;
import java.awt.geom.Point2D;
import com.pluralsight.Turtle;

public abstract class Shape {
    protected Turtle turtle;
    protected Point location;
    protected Color color;
    protected double border;

    public Shape(Turtle turtle, Point location, Color color, double border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public abstract void paint();
}
