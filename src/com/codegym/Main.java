package com.codegym;

import java.util.*;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        // Sử dụng List
        List<String> al = new ArrayList<>();
        al.addAll(asList("CodeGym", "Bootcamp", "Java"));

        List<String> ll = new LinkedList<>();
        ll.addAll(asList("CodeGym", "Bootcamp", "Java"));


        // Duyệt các phần tử với iterator
        Iterator<String> iterator = ll.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        // Duyệt các phần tử với for-each
        for (String item : al){
            System.out.println(item);
        }

        // Sử dụng HashSet
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("A");
        myHashSet.add("A");
        myHashSet.add("A");
        System.out.println(myHashSet);
    }
}
