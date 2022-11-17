package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.api.Vehicle;
import ua.hillelit.homeworks.entity.Auto;

import java.util.HashMap;
import java.util.Map;

public class AutoFactory implements VehicleFactory {

    private final Map<String, Auto> autos = new HashMap<>();


    public void removeAutos() {
        autos.clear();
    }

    @Override
    public boolean createTransport(String brand, Vehicle auto) {
        if (!auto.getClass().equals(Auto.class)) {
            return false;
        }
        if (brand == null && auto == null) {
            System.out.println("AutoFactory: createTransport - object cannot be a null");
            return false;
        }
        autos.put(brand, (Auto) auto);
        return true;
    }

    @Override
    public boolean destroyTransport(String brand) {
        if (brand == null) {
            System.out.println("AutoFactory: destroyTransport - object cannot be a null");
            return false;
        }
        autos.remove(brand);
        return true;
    }

    public Map<String, Auto> getAutos() {
        return autos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoFactory that = (AutoFactory) o;

        return autos != null ? autos.equals(that.autos) : that.autos == null;
    }

    @Override
    public int hashCode() {
        return autos != null ? autos.hashCode() : 0;
    }
}
