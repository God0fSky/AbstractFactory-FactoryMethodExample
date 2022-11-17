package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.api.Vehicle;
import ua.hillelit.homeworks.entity.Auto;
import ua.hillelit.homeworks.entity.Ship;

import java.util.HashMap;
import java.util.Map;

public class ShipFactory implements VehicleFactory {

    private final Map<String, Ship> ships = new HashMap<>();

    public void removeShips() {
        ships.clear();
    }

    @Override
    public boolean createTransport(String brand, Vehicle ship) {
        if (!ship.getClass().equals(Ship.class)) {
            return false;
        }
        if (brand == null && ship == null) {
            System.out.println("ShipFactory: createTransport - object cannot be a null");
            return false;
        }
        ships.put(brand, (Ship) ship);
        return true;
    }

    @Override
    public boolean destroyTransport(String brand) {
        if (brand == null) {
            System.out.println("ShipFactory: destroyTransport - object cannot be a null");
            return false;
        }
        ships.remove(brand);
        return true;
    }

    public Map<String, Ship> getShips() {
        return ships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShipFactory that = (ShipFactory) o;

        return ships != null ? ships.equals(that.ships) : that.ships == null;
    }

    @Override
    public int hashCode() {
        return ships != null ? ships.hashCode() : 0;
    }
}
