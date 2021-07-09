package abstractFactory.factory;

import abstractFactory.cars.Car;
import abstractFactory.cars.HondaCar;
import abstractFactory.motorcycle.HondaMotorcycle;
import abstractFactory.motorcycle.Motorcycle;

public class HondaConcrete extends AbstractFactory {
    @Override
    public Car createCar() {
        return new HondaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new HondaMotorcycle();
    }
}
