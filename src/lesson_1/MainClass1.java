package lesson_1;

import java.util.Arrays;

public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("Hello " );
        int var1;
        var1 = 5;
        int var2 = 10;
        int result = var1+var2;
        System.out.println("Result = " + (result + 15));

        Calc.sum(var1,var2);

        Calc calc = new Calc();
        System.out.println(56+calc.sumDouble(var1, 7));
        String resultString = calc.sumDouble("test ", "pass");
        calc.sumDouble(resultString, "!!!");

    }
}
