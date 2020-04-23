package com.codegym;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map<String, String> englishVietnamese = new HashMap<>();

        englishVietnamese.put("Hello", "Xin chào");   // add entry
        englishVietnamese.put("Goodbye", "Tạm biệt"); // add entry
        englishVietnamese.put("A", "một"); // add entry
        englishVietnamese.put("Zoo", "Sở thú"); // add entry

        // không có first, last

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(10, "CodeGym"); // add entry
        myMap.put(1, "Bootcamp"); // add entry
        myMap.put(5, "Java");
        myMap.put(7, "PHP");
        myMap.put(7, "Bootcamp");

        TreeMap<String, String> treeMap = new TreeMap<>(englishVietnamese); // key có thứ tự

        treeMap.keySet();
        treeMap.values();

        Map.Entry<String, String> firstEntry = treeMap.firstEntry();
        Map.Entry<String, String> lastEntry = treeMap.lastEntry();

        System.out.println(firstEntry.getKey());
        System.out.println(lastEntry.getKey());

        // System.out.println(myMap.get(7));

//        Iterable<String> myMapValues = myMap.values();
//
//        for (String item : myMapValues) {
//            System.out.println(item);
//        }

        Set<Integer> myMapKeys = myMap.keySet();
        for (int item : myMapKeys) {
            System.out.println(item);
        }
    }
}
