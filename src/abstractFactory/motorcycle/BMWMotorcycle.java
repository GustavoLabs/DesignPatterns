package abstractFactory.motorcycle;

import abstractFactory.motorcycle.Motorcycle;

public class BMWMotorcycle extends Motorcycle {

    public BMWMotorcycle() {
        setMaxSpeed(380);
    }

    public String toString(){
        return "BMW Motorcyle, MaxSpeed: " + getMaxSpeed();
    }
}


