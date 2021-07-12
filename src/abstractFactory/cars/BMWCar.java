package abstractFactory.cars;

import abstractFactory.cars.Car;

public class BMWCar extends Car {

    public BMWCar() {
        setMaxSpeed(350);
    }

    public String toString(){
        return "BMW Car, MaxSpeed: " + getMaxSpeed();
    }
}
