package abstractFactory.cars;

import abstractFactory.cars.Car;

public class HondaCar extends Car {

    public HondaCar() {
        setMaxSpeed(250);
    }

    public String toString(){
        return "Honda Car, MaxSpeed: " + getMaxSpeed();
    }
}
