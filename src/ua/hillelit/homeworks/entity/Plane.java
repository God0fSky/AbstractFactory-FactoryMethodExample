package ua.hillelit.homeworks.entity;

import ua.hillelit.homeworks.api.Transportable;
import ua.hillelit.homeworks.api.Vehicle;

public class Plane extends Vehicle implements Transportable {

    public Plane(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void move() {
        System.out.println(brand + " is flying");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void transportCargo() {
        System.out.println("Plane " + brand + " is transporting the cargo");
    }
}
