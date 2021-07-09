package abstractFactory.cars;

public class HondaCar extends Car {

    public HondaCar() {
        setMaxSpeed(250);
    }

    public String toString(){
        return "Honda Car, MaxSpeed: " + getMaxSpeed();
    }
}
