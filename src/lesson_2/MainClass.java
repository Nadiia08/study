package lesson_2;

public class MainClass {
    public static void main(String[] args) {
        CalcClass calcClass= new CalcClass();
        int rez1= calcClass.sumDoubled(6,8);
        System.out.println("Rez 1 = "+ rez1);

        calcClass.sumDoubled(6, "testirium");

        calcClass.sumDoubled("87",3);

        int res_3 = calcClass.sumDoubled("8p",3);
        System.out.println("Res_3 = " + res_3);

        int[] ourMassive = {2,4,26,7,28,10,9,20,33};
        System.out.println(ourMassive);
        System.out.println(ourMassive[0]);
        System.out.println(ourMassive.length);

        int[] massive = new int[5];
        massive[0]=8;
        massive[1]=8;
        massive[2]=8;
        System.out.println("Massive");
        for (int i = 3, n=1; i < 5; i++, n++) {
            massive[i]= n+5;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(massive[i]);
            if(massive[i]==6){
                System.out.println("Equals 6");
            }
            else  if (massive[i]==7){
                System.out.println("Equals 7");
            }
//            else {
//                System.out.println("-"+massive[i]);
//            }
        }


        System.out.println("Multiplication");
        int rez_4 = calcClass.multiplicationDoubled(0,89);
        System.out.println("Rez_4 = "+ rez_4);

        System.out.println("Division");
        float rez_5 = calcClass.divisionDoubled(57.4f, 7.6F);
        System.out.println("Rez_5 = "+ rez_5);



        System.out.println("--------The end--------");
    }
}

