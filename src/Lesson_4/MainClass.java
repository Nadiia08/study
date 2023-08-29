package Lesson_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<String> ourList = new ArrayList();
        System.out.println(ourList);
        ourList.add("Test1");
        System.out.println(ourList);
        ourList.add("Test2");
        ourList.add("Test3");
        System.out.println(ourList);
        ourList.add("");
        ourList.add("Test5");
        System.out.println(ourList.get(2) + "," + ourList.get(4));
        ourList.remove(1);
        System.out.println(ourList);

        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(ourList.get(i));
        }
        for (String element : ourList) {
            System.out.println(element);
        }
        ourList.add(2, "Test 54");
        System.out.println(ourList);
        System.out.println("----------------------");

        ArrayList<Integer> ourListIntenger = new ArrayList<>();
        ourListIntenger.add(22);
        ourListIntenger.add(66);
        ourListIntenger.add(33);
        ourListIntenger.add(11);
        System.out.println(ourListIntenger);

        System.out.println(Collections.max(ourListIntenger));
        System.out.println(Collections.min(ourListIntenger));
        Collections.sort(ourListIntenger);
        System.out.println(ourListIntenger);
        Collections.reverse(ourListIntenger);
        System.out.println(ourListIntenger);

        int temp;

        for (int i = 0; i < ourListIntenger.size(); i++) {
            for (int j = 0; j < ourListIntenger.size(); j++) {
               if(ourListIntenger.get(i)>ourListIntenger.get(j)){
                   temp=ourListIntenger.get(i);
                   ourListIntenger.set(i,ourListIntenger.get(j));
                   ourListIntenger.set(j,temp);
               }
            }
        }

        System.out.println(ourListIntenger);
        System.out.println("-----LIST--------------");

        ArrayList <ArrayList<String>> liastList = new ArrayList<>();
        liastList.add(new ArrayList<>());
        liastList.get(0).add("test11");
        liastList.get(0).add("test22");
        System.out.println(liastList);
        liastList.add(new ArrayList<>());
        liastList.get(1).add("Test21");
        liastList.add(new ArrayList<>());
        liastList.add(new ArrayList<>());
        liastList.get(3).add("Test41");
        System.out.println(liastList);
        liastList.get(0).add(0,"test13");
        System.out.println(liastList);

        ArrayList<String> list = new ArrayList<>();
        list.add("element1");
        list.add("element2");
        System.out.println(list);

        liastList.add(list);
        System.out.println("result"+liastList);





        System.out.println("---The End----");
    }
}
