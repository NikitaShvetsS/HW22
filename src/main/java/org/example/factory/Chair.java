package org.example.factory;

public class Chair extends Furniture{
    @Override
    public void assemble() {
        System.out.println("Assembling a chair");
    }
}
