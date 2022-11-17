package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.api.Transportable;
import ua.hillelit.homeworks.api.TransporterFactory;
import ua.hillelit.homeworks.entity.Ship;

public class ShipTransporterFactory implements TransporterFactory {
    @Override
    public Transportable createTransporter(String brand, String model) {
        return new Ship(brand, model);
    }
}
