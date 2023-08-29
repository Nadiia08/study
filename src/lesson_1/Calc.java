package lesson_1;

public class Calc {
    public static void sum(int dodanok1, int dodanok2 ){
        int tempResult = dodanok1 + dodanok2;
        System.out.println(tempResult);
    }

    public int sumDouble(int dodanok1, int dodanok2){
       int tempResult = (dodanok1 + dodanok2) * 2;
        System.out.println("Double result " + tempResult);
        return tempResult;
    }

    public String sumDouble (String dodanokString1, String dodanokString2){
        String tempResult=dodanokString1+dodanokString2+dodanokString1+dodanokString2;
        System.out.println(tempResult);
        return tempResult;
    }
}
