package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.entity.Plane;

import java.util.Map;

public class PlaneFactory implements TransportFactory {

    private Map<String, Plane> planes;

    @Override
    public boolean createTransport() {
        return false;
    }

    @Override
    public boolean destroyTransport() {
        return false;
    }
}
