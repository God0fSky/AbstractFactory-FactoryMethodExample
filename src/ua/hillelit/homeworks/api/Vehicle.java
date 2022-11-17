package ua.hillelit.homeworks.api;

public abstract class Vehicle {

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected String brand;
    protected String model;
    public abstract void move();

}
