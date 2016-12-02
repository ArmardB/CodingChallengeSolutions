package com.armardbellamy.main;

import java.util.*;

/**
 * Created by armardbellamy on 11/20/16.
 */
public class HashMapPractice {

    public HashMapPractice() {
    }

    public static void main(String[] args) {
        Map<String, Integer> pets = new HashMap<>();

        pets.put("dog", 1);
        pets.put("cat", 2);
        pets.put("bear", 3);

//        Set set = pets.entrySet();
//
//
//        Iterator it = set.iterator();
//
//        while(it.hasNext()){
//            Map.Entry me = (Map.Entry)it.next();
//            System.out.println(me.getKey());
//            System.out.println(me.getValue());
//        }

        for(Map.Entry me: pets.entrySet()){
            String animal = (String) me.getKey();
            int number = (int) me.getValue();

            System.out.println("Animal: " + animal + " Count: " + number);
        }
    }
}
