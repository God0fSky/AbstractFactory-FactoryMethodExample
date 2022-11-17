package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.api.Vehicle;
import ua.hillelit.homeworks.entity.Auto;
import ua.hillelit.homeworks.entity.Plane;

import java.util.HashMap;
import java.util.Map;

public class PlaneFactory implements VehicleFactory {

    private final Map<String, Plane> planes = new HashMap<>();

    public void removePlanes() {
        planes.clear();
    }

    @Override
    public boolean createTransport(String brand, Vehicle plane) {
        if (!plane.getClass().equals(Plane.class)) {
            return false;
        }
        if (brand == null && plane == null) {
            System.out.println("PlaneFactory: createTransport - object cannot be a null");
            return false;
        }
        planes.put(brand, (Plane) plane);
        return true;
    }

    @Override
    public boolean destroyTransport(String brand) {
        if (brand == null) {
            System.out.println("PlaneFactory: destroyTransport - object cannot be a null");
            return false;
        }
        planes.remove(brand);
        return true;
    }

    public Map<String, Plane> getPlanes() {
        return planes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaneFactory that = (PlaneFactory) o;

        return planes != null ? planes.equals(that.planes) : that.planes == null;
    }

    @Override
    public int hashCode() {
        return planes != null ? planes.hashCode() : 0;
    }
}
