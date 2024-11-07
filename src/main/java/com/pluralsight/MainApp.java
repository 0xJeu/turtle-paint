package com.pluralsight;

import com.shapes.Circle;
import com.shapes.Square;
import com.shapes.Triangle;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainApp {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        World world = new World();
        Turtle turtle = new Turtle(world, 0, 0);

        while (true) {
            // The world is your canvas

            displayCommands();
            int userInput = Integer.parseInt(keyboard.nextLine());


            switch (userInput) {
                case 1:
                    addShape(turtle, world);
                    break;
                case 2:
                    saveShape(world);
                case 0:
                    System.exit(0);

            }

        }


//        Point location4 = new Point(-60, 60);

//        Hexagon hexagon = new Hexagon(turtle, location4, Color.BLACK, 10);

//        hexagon.paint();


    }

    public static void displayCommands() {
        System.out.print("""
                1) Add Shape
                2) Save Image
                0) Exit
                
                Please enter selection:""");
    }

    public static void addShape(Turtle turtle, World world) {

        while (true) {
            final Map<String, Color> COLOR_MAP = new HashMap<>();
            Point location;

            {
                // Initialize the color map
                COLOR_MAP.put("red", Color.RED);
                COLOR_MAP.put("green", Color.GREEN);
                COLOR_MAP.put("blue", Color.BLUE);
                COLOR_MAP.put("yellow", Color.YELLOW);
                COLOR_MAP.put("black", Color.BLACK);
                COLOR_MAP.put("white", Color.WHITE);
                // Add more colors as needed
            }

            System.out.print("Which shape (1. square, 2. circle, 3. triangle 4. Return to home-screen)?");
            int shapeChoice = Integer.parseInt(keyboard.nextLine());

            if (shapeChoice == 4) {
                break;
            }

            System.out.print("What is the border width?");
            double border = Double.parseDouble(keyboard.nextLine());

            System.out.println("The available colors are: " + String.join(", ", COLOR_MAP.keySet()));
            System.out.print("Please select a color:");
            String userColorChoice = keyboard.nextLine().toLowerCase();
            Color color = COLOR_MAP.get(userColorChoice);
            if (color == null) {
                System.out.println("Color not found. Available colors are: " + String.join(", ", COLOR_MAP.keySet()));
                return;
            }

            System.out.print("What is the location of the shape (x,y)?:");
            String userResponse = keyboard.nextLine();
            if (userResponse.isEmpty()) {
                location = new Point(100, -100);
            } else {
                String[] responseSplit = userResponse.split(Pattern.quote(","));
                int x = Integer.parseInt(responseSplit[0]);
                int y = Integer.parseInt(responseSplit[1]);
                location = new Point(x, y);
            }


            switch (shapeChoice) {
                case 1:
                    Square square = new Square(turtle, location, color, border);
                    square.paint();
                    break;
                case 2:
                    System.out.print("What is the radius?");
                    double radius = Double.parseDouble(keyboard.nextLine());
                    Circle circle = new Circle(turtle, location, color, border, radius);
                    circle.paint();
                    break;
                case 3:
                    Triangle triangle = new Triangle(turtle, location, color, border);
                    triangle.paint();
                    break;
            }
        }
    }

    public static void saveShape(World world) {
        world.saveAs("src/main/resources/painting.png");
    }
}
