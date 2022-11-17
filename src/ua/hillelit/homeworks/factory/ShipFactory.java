package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.entity.Ship;

import java.util.Map;

public class ShipFactory implements TransportFactory{

    private Map<String, Ship> ships;

    @Override
    public boolean createTransport() {

        return false;
    }

    @Override
    public boolean destroyTransport() {
        return false;
    }
}
