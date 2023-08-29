package Lesson_3;

public class MainClass {
    public static void main(String[] args) {
        int[][] massiveMassive = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11}};
        System.out.println("Rows = " + massiveMassive.length);
        System.out.println("Line 2 = " + massiveMassive[1].length);
        System.out.println("Element = " + massiveMassive[2][2]);
        System.out.println("----------------");

        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                System.out.print(massiveMassive[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        int[][] massive2 = new int[8][8];
        for (int i = 0; i < massive2.length; i++) {
            for (int j = 0; j < massive2[i].length; j++) {
                if (j==massive2.length - i-1 )
//                        (i == massive2.length - 1 && j == massive2.length - 1) || i == 0 || j == 0
//                        || (i == massive2.length - 1) || (j == massive2.length - 1) ||
//                        (massive2.length%2==0 && i == massive2.length / 2 && j == massive2.length / 2 )
                {
                    massive2[i][j] = 5;
                } else massive2[i][j] = 0;

            }

        }
        printMassive(massive2);
        System.out.println("----------------");
    }

    private static void printMassive(int[][] massive) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }
}
