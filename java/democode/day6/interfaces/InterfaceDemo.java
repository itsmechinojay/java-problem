package com.accenture.democode.day6.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Shape square = new Square();

        String userInput = new Scanner(System.in).nextLine();
        Shape shape = getShapeObj(userInput);

        if (shape instanceof Circle) {
            System.out.println("Circle object created");
        } else if (shape instanceof Square) {
            System.out.println("Square object created");
        } else {
            System.out.println("Invalid input");
        }

        List<String> names = new ArrayList<String>();

    }

    // factory method
    public static Shape getShapeObj(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return  new Square();
        } else {
            return null;
        }
    }

}
