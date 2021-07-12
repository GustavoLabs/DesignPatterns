package adapter.coin;

public class RealAdapter implements Coin{
    private final Dollar dollar;

    public RealAdapter (Dollar dollar){
        this.dollar = dollar;
    }

    @Override
    public double getValue() {
        return convertDollarToReal(dollar.getValue());
    }

    private double convertDollarToReal(double value){
        double DOLLAR_EXCHANGE_RATE = 5.24;
        return  value * DOLLAR_EXCHANGE_RATE;
    }



}
