package lesson_2;

public class CalcClass {
    public int sumDoubled(int dodanok1, int dodanok2) {
        int tempResult = 2 * (dodanok1 + dodanok2);
        System.out.println("Sum = " + tempResult);
        return tempResult;
    }

    /**
     *
     * @param dodanok1
     * @param dodanok2
     * @return
     */
    public String sumDoubled(int dodanok1, String dodanok2) {
        String result = "" + 2 * dodanok1 + dodanok2 + dodanok2;
        System.out.println("Result = " + result);
        return result;
    }

    public int sumDoubled(String dodanok1, int dodanok2) {
        try {
            int result = (Integer.parseInt(dodanok1) + dodanok2) * 2;
            System.out.println("Result = " + result);
            return result;
        } catch (NumberFormatException e) {
            System.out.println("Number format exception " + e.getMessage());
            return 999;
        } catch (Exception e) {
            System.out.println("Error " + e);
            return 888;
        } finally {
            System.out.println("Finally");
        }
    }

    public int multiplicationDoubled (int mnognyk1, int mnognyk2 ){
        int result = 2*mnognyk1*mnognyk2;
        System.out.println("Result of multiplication "+result);
        return result;
    }

    public float divisionDoubled (float delimoe, float delitel){
        try {
            float result = delimoe / delitel * 2;
            System.out.println("Result of division "+result);

            return result;
        } catch (Exception e){
            System.out.println("Impossible");
            return 444;
        }
    }
}
