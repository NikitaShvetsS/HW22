package org.example.strategy;

public class Rectangle implements CalcArea{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
