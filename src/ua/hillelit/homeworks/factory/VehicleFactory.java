package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.api.Vehicle;

import java.util.Map;

public interface VehicleFactory {

    boolean createTransport(String s, Vehicle v);

    boolean destroyTransport(String s);

}
