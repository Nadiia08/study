package currency;

import java.text.DecimalFormat;

abstract class Currency {
    private double kursNBU;
    private double marga = 1.1;
    DecimalFormat df= new DecimalFormat("0.00");

    public Currency(double kursNBU){
        this.kursNBU = kursNBU;
    }

    public double getKursNBU (){
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    private double getKursBuy (){
        return kursNBU*marga;
    }
    private double getKursSell (){
        return kursNBU/marga;
    }

    abstract String getCurrencyName();

    public double excnahgeGrnToCurrency (double numberOfGrn){
        double tempResult = numberOfGrn/getKursBuy();
        System.out.println(String.format("For %s GRN you get %s %s by kurs %s (marga %s)",
                numberOfGrn, df.format(tempResult), getCurrencyName(), df.format(getKursBuy()), df.format(marga)));
        return  tempResult;
    }

    public double exchangeCurrencyToGrn (double numberOfCurrency){
        double tempResult= numberOfCurrency*getKursSell();
        System.out.println(String.format("For %s %s you get %s GRN by kurs %s (marga %s)",
                numberOfCurrency, getCurrencyName(), df.format(tempResult), df.format(getKursSell()),marga));
        return tempResult;
    }

}
