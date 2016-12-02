package com.armardbellamy.main;

import java.util.*;

class Sorter implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int x = o1.length();
        int y = o2.length();

        return y - x;
    }
}

public class SortByLength {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("remote", "headphones", "cat", "money", "christmas"));

        Collections.sort(stringList, new Sorter());
        System.out.println(stringList);

    }
}
