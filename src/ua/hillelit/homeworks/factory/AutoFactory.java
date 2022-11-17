package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.entity.Auto;

import java.util.Map;

public class AutoFactory implements TransportFactory{

    private Map<String, Auto> autos;

    @Override
    public boolean createTransport() {
        return false;
    }

    @Override
    public boolean destroyTransport() {
        return false;
    }
}
