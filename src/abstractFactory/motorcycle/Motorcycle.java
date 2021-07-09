package abstractFactory.motorcycle;

public abstract class Motorcycle {

    private final int wheels = 2;
    private int MaxSpeed;

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
