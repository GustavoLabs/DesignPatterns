package adapter.coin;

public class Dollar implements Coin{

    private double dollar;

    public Dollar(double dollar) {
        this.dollar = dollar;
    }

    @Override
    public double getValue() {
        return dollar;
    }

}
