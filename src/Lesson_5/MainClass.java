package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap<>();
        System.out.println(ourMap);
        ourMap.put("login","Test");
        System.out.println(ourMap);
        ourMap.put("pass", "123");
        System.out.println(ourMap);
        System.out.println(ourMap.get("pass"));
        System.out.println(ourMap.size());
        ourMap.put("login", "test1");
        System.out.println(ourMap);
        System.out.println("--------------");

        ArrayList<HashMap<String, String>> table = new ArrayList<>();
        HashMap<String, String> line1 = new HashMap<>();
        line1.put("login", "test");
        line1.put("pass", "123");

        table.add(line1);
        HashMap<String, String> line2 = new HashMap<>();
        line2.put("login","test1");
        line2.put("pass", "222");
        table.add(line2);
        System.out.println(table);
        System.out.println(table.get(1).get("pass"));
    }
}
