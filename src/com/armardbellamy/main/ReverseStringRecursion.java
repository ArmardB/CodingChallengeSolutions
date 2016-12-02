package com.armardbellamy.main;

/**
 * Created by armardbellamy on 11/14/16.
 */
public class ReverseStringRecursion {

    public static void main(String[] args) {

        System.out.println(reverse("Armard"));

    }

    public static String reverse(String str){
        if((str == null) || (str.length() < 1)){
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }


    }
}
