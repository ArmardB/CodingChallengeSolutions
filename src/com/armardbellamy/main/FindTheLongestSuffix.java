package com.armardbellamy.main;

/**
 * Created by armardbellamy on 11/15/16.
 */
public class FindTheLongestSuffix {

    public static void main(String[] args)  {

            System.out.println(findLongestSuffix("Gather,thing"));

        }


    public static String findLongestSuffix(String s ) {
        String[] splitWords = s.split(",");
        String wordOne = splitWords[0];
        String wordTwo = splitWords[1];
        boolean noMatch = false;


        int longestWord;

        if(wordOne.length() > wordTwo.length()){
            longestWord = wordOne.length();
        } else{
            longestWord = wordTwo.length();
        }

        if(wordOne == null || wordTwo == null){
            return "";
        }

        String longestSuffixBetweenTwoWords = "";

        for(int i = longestWord - 1; i > 0; i--){
            if(wordOne.charAt(i) != wordTwo.charAt(i)){
                noMatch = true;
                break;

            } else if (wordOne.charAt(i) == wordTwo.charAt(i)){
                longestSuffixBetweenTwoWords += wordOne.charAt(i);
            }

        }


        String finalAnswer = new StringBuilder(longestSuffixBetweenTwoWords).reverse().toString();
        return finalAnswer;

    }

}

