package com.armardbellamy.main;

import java.util.HashMap;
import java.util.Map;


public class NumberOfDuplicates {

    // Given an array of characters, find out the number of duplicate characters in the array

    public static void main(String[] args) {
        char[] ch = {'a', 'a', 'c', 'd', 'd', 'e', 'h'};
        System.out.println(numberOfDuplicates(ch));
    }

    public static int numberOfDuplicates(char[] chars){
        char[] charHolder = chars;
        int count = 0;
        Map<Character, Integer> charAndCountContainer = new HashMap<>();

        for(int i = 0; i < chars.length; i++){
            if(charAndCountContainer.containsKey(charHolder[i])) {
                charAndCountContainer.put(charHolder[i], charAndCountContainer.get(charHolder[i])+ 1);
            } else if(!charAndCountContainer.containsKey(charHolder[i])) {
                charAndCountContainer.put(charHolder[i], 1);
            }
        }

        for(Integer num: charAndCountContainer.values()){
            if(num > 1){
                count += 1;
            }
        }

        return count;
    }
}
