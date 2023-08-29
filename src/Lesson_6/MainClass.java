package Lesson_6;

import org.apache.log4j.Logger;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Logger logger = Logger.getLogger("MainClass");


        logger.error("Error");
        logger.info("Info");
        logger.debug("Debug");

        int [][] massive = {{1,2,3},{4,5}};
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j]+" ");
            }
            System.out.println();
        }

        Console console = new Console();
        console.print();
        console.print();

    }
}
