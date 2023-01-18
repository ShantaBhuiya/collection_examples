package com.collection.list;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("Mehedi", 2000);
        salary.put("Asma", 1000);
        salary.put("Tanha", 3000);
        salary.put("Shanta", 4000);
        salary.put("Helal", 5000);

        System.out.println(salary);
        salary.put("Mehd", 2400);
        System.out.println(salary);
        System.out.println(salary.remove("Mehd"));
        System.out.println(salary);
        System.out.println(salary.get("Shanta"));
        System.out.println(salary.size());
        System.out.println(salary.containsKey("Asma"));
        System.out.println(salary.containsValue(2000));
        System.out.println(salary.replace("Mehedi", 90000));
        System.out.println(salary);
        System.out.println(salary.putIfAbsent("Sabrina", 70000));
        System.out.println(salary);

        HashMap<Integer, Integer> id = new HashMap<>();
        id.put(1234, 3456);



    }


}
