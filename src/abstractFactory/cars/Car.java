package abstractFactory.cars;

public abstract class Car {

    private final int wheels = 4;
    private int MaxSpeed;

    public Car() {

    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }
}
