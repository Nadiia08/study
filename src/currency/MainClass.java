package currency;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(36);
        System.out.println("Dollar "+dollar.getKursNBU());
        dollar.setKursNBU(36.5);
        System.out.println("New kurs "+ dollar.getKursNBU());

        dollar.excnahgeGrnToCurrency(4015);
        dollar.exchangeCurrencyToGrn(1000);
        dollar.setMarga(1.15);
        dollar.excnahgeGrnToCurrency(4015);
        dollar.exchangeCurrencyToGrn(1000);

        Euro euro = new Euro(40);
        euro.exchangeCurrencyToGrn(1000);

        Bitcoin bitcoin = new Bitcoin(1000);
        bitcoin.exchangeCurrencyToGrn(30);
        bitcoin.excnahgeGrnToCurrency(60);

    }
}
