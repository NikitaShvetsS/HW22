package org.example.builder;

public interface Builder {
    CarBuilder setBrand(String brand);
    void setModel(String model);
    void setYear(int year);
    void setColor(String color);
}
