package com.armardbellamy.main;

/**
 * Created by armardbellamy on 11/16/16.
 */
public class ReverseASentence {
    public static void main(String[] args) {

        String one = "Armard you will get an a job offer from Guru today!";
        char[] oneArr = one.toCharArray();
        char[] res = new char[oneArr.length];
        String two = "";
        int counter = 0;

        for(int i = one.length() - 1; i > 0; i--){
            res[counter] = oneArr[i];
            counter++;
        }

        System.out.println(res);

    }


}
