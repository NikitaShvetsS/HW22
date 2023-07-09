package org.example.builder;

public class CarBuilder implements Builder{
    private String brand;
    private String model;
    private int year;
    private String color;
    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    @Override
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public Car getResult(){
        return new Car(brand, model, year, color);
    }
}
