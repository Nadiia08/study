package currency;

public class Bitcoin extends Currency implements IsCripta{

    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "bitcoin";
    }


    @Override
    public boolean isCripta() {
        return true;
    }
}
