package com.armardbellamy.main;


public class StringPractice {

    public static void main(String[] args) {
        String word = "armard";
        longestPalindrome(word);

    }

    static int longestPalindrome(String s) {


        int len = s.length();
        int longestSub = 0;
        String regString = s;
        String revString = new StringBuilder(s).reverse().toString();
        int counter = len - 1;


        for(int i = 0; i < len; i++){

            if( len == 2){
                longestSub = 1;
            } else if(regString.equals(revString)){
                longestSub = regString.length();

            } else if (!regString.equals(revString)){

                regString = regString.substring(i);
                revString = revString.substring(0, counter);
            }

        }
        System.out.println(longestSub);
        return longestSub;
    }
}
