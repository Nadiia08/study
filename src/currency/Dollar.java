package currency;

public class Dollar extends Currency implements IsFreeConverted{
    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }

    @Override
    public boolean IsFreeConv() {
        return true;
    }
}
