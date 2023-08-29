package Lesson_3;

public class MainClassString {
    public static void main(String[] args) {
        String testString = " Test2";
        System.out.println("Size = " + testString.length());
        char[] testStringChar = testString.toCharArray();

        for (int i = 0; i < testStringChar.length; i++) {
            System.out.print(testStringChar[i] + " ");
        }
        System.out.println("---------------");
        System.out.println(testString.toUpperCase());

        String newStringTest = testString.toLowerCase();
        System.out.println(newStringTest);
        System.out.println(newStringTest.substring(1, 5));
        System.out.println("'" + testString.trim() + "'");

        String testString2 = new String(" Test2");
        if (testString.equalsIgnoreCase(testString2)) {
            System.out.println("Eq");
        } else System.out.println("not eq");

        String testSplite = "test1,test2,test3";
        System.out.println(testSplite.split(",")[2]);
        System.out.println(testSplite.replace(",", ";"));
        System.out.println(testSplite.trim().toUpperCase().split(",")[0].substring(0, 4));

        System.out.println(testString.replace("T","Y"));

    }
}
