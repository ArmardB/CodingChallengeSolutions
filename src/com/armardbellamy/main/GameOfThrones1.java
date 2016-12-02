package com.armardbellamy.main;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by armardbellamy on 11/2/16.
 */
public class GameOfThrones1 {

    static String is_Palindrome(String s) {
        String str = s;

        Set<Character> mailBox = new HashSet<Character>();
        for(Character letter : str.toCharArray()){
            if(mailBox.contains(letter)){
                mailBox.remove(letter);
            }else{
                mailBox.add(letter);
            }
        }


        if(mailBox.size() <= 1) {
            return "YES";
        } else {
            return "NO";
        }

    }
}
