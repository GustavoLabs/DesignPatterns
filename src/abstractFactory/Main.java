package abstractFactory;

import abstractFactory.cars.Car;
import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.Type;
import abstractFactory.motorcycle.Motorcycle;

public class Main {

    public static void main(String[] args) {

        AbstractFactory factory = AbstractFactory.getFactory(Type.BMW);
        Car BMWCar = factory.createCar();
        Motorcycle BMWMoto = factory.createMotorcycle();
        System.out.println(BMWCar);
        System.out.println(BMWMoto);

        factory = AbstractFactory.getFactory(Type.HONDA);

        Car HondaCar = factory.createCar();
        Motorcycle HondaMoto = factory.createMotorcycle();

        System.out.println(HondaCar);
        System.out.println(HondaMoto);

    }
}
