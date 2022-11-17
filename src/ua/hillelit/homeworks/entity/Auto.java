package ua.hillelit.homeworks.entity;

import ua.hillelit.homeworks.api.Transportable;
import ua.hillelit.homeworks.api.Vehicle;

public class Auto extends Vehicle implements Transportable {


    public Auto(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void move() {
        System.out.println(brand + " is driving!");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void transportCargo() {
        System.out.println("Auto " + brand + " is transporting the cargo");
    }
}
