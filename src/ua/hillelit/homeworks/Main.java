package ua.hillelit.homeworks;

import ua.hillelit.homeworks.api.TransporterFactory;
import ua.hillelit.homeworks.api.Vehicle;
import ua.hillelit.homeworks.entity.Auto;
import ua.hillelit.homeworks.entity.Plane;
import ua.hillelit.homeworks.entity.Ship;
import ua.hillelit.homeworks.factory.*;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        AutoFactory autoFactory = new AutoFactory();
        PlaneFactory planeFactory = new PlaneFactory();
        ShipFactory shipFactory = new ShipFactory();

        planeFactory.createTransport("Boeing", new Plane("Boeing", "1"));
        planeFactory.createTransport("Airbus", new Plane("Airbus", "2"));
        planeFactory.createTransport("An", new Plane("An", "3"));

        autoFactory.createTransport("Tesla", new Auto("Tesla", "1"));
        autoFactory.createTransport("BMW", new Auto("BMW", "2"));
        autoFactory.createTransport("Audi", new Auto("Audi", "3"));

        shipFactory.createTransport("Aida", new Ship("Aida", "1"));
        shipFactory.createTransport("Costa", new Ship("Costa", "2"));
        shipFactory.createTransport("Cruise line", new Ship("Cruise line", "3"));

        autoFactory.getAutos().entrySet().stream()
                .peek(a -> System.out.println(a.getValue().toString()))
                .peek(a -> a.getValue().move())
                .collect(Collectors.toList());
        System.out.println();

        shipFactory.getShips().entrySet().stream()
                .peek(s -> System.out.println(s.getValue().toString()))
                .peek(s -> s.getValue().move())
                .collect(Collectors.toList());
        System.out.println();

        planeFactory.getPlanes().entrySet().stream()
                .peek(p -> System.out.println(p.getValue().toString()))
                .peek(p -> p.getValue().move())
                .collect(Collectors.toList());
        System.out.println();

        TransporterFactory transporterFactory = createTransporter(Auto.class.getName());
        Auto infinity = (Auto) transporterFactory.createTransporter("Infinity", "555");
        System.out.println(infinity.toString());
    }

    public static TransporterFactory createTransporter(String vehicle) {
        System.out.println(vehicle);
        System.out.println(Auto.class.getName());
        if (vehicle.equals(Auto.class.getName())) {
            return new AutoTransporterFactory();
        } else {
            if (vehicle.equals(Plane.class.getName())) {
                return new PlaneTransporterFactory();
            } else {
                if (vehicle.equals(Ship.class.getName())) {
                    return new ShipTransporterFactory();
                } else {
                    throw new RuntimeException("Unknown vehicle");
                }
            }
        }
    }

}
