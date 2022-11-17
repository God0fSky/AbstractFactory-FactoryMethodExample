package ua.hillelit.homeworks.entity;

import ua.hillelit.homeworks.api.Transportable;
import ua.hillelit.homeworks.api.Vehicle;

public class Ship extends Vehicle implements Transportable {


    public Ship(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void move() {
        System.out.println(brand + " is sailing");
    }

    @Override
    public String toString() {
        return "Ship{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void transportCargo() {
        System.out.println("Ship " + brand + " is transporting the cargo");
    }
}
