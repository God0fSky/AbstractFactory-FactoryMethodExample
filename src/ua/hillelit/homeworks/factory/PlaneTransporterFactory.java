package ua.hillelit.homeworks.factory;

import ua.hillelit.homeworks.api.Transportable;
import ua.hillelit.homeworks.api.TransporterFactory;
import ua.hillelit.homeworks.entity.Plane;

public class PlaneTransporterFactory implements TransporterFactory {
    @Override
    public Transportable createTransporter(String brand, String model) {
        return new Plane(brand, model);
    }
}
