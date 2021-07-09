package abstractFactory.factory;

import abstractFactory.cars.BMWCar;
import abstractFactory.cars.Car;
import abstractFactory.motorcycle.BMWMotorcycle;
import abstractFactory.motorcycle.Motorcycle;

public class BMWConcrete extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BMWCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new BMWMotorcycle();
    }
}
