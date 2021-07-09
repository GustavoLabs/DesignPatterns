package abstractFactory.factory;

import abstractFactory.cars.Car;
import abstractFactory.motorcycle.Motorcycle;

public abstract class AbstractFactory {
    private static final abstractFactory.factory.BMWConcrete BMWConcrete = new BMWConcrete();
    private static final abstractFactory.factory.HondaConcrete HondaConcrete = new HondaConcrete();

    public static AbstractFactory getFactory(Type type) {
        AbstractFactory factory = null;
        switch (type) {
            case BMW:
                factory = BMWConcrete;
                break;
            case HONDA:
                factory = HondaConcrete;
                break;
        }
        return factory;
    }

    public abstract Car createCar();
    public abstract Motorcycle createMotorcycle();

}



