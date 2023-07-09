package org.example.strategy;

public class Main {
    public static void main(String[] args) {

        CalcArea rectangle = new Rectangle(4, 6);
        double rectangleArea = rectangle.calcArea();
        System.out.println("Rectangle area is: " + rectangleArea);

        CalcArea triangle = new Triangle(5, 3);
        double triangleArea = triangle.calcArea();
        System.out.println("Triangle area is: " + triangleArea);
    }
}
