package com.armardbellamy.main;

/**
 * Created by armardbellamy on 11/12/16.
 */
public class FancyString {


        public static void main(String[] args)  {

            String s = "1234567";

                System.out.println(fancyString(s));
        }

        public static String fancyString(String s){
            String finalOutput = "";
            int strLength = s.length();
            String[] splitString = s.split("");

            for(int i = 0; i < strLength -1; i++){
                if(((Integer.parseInt(splitString[i]) % 2) == 0) && ((Integer.parseInt(splitString[i+1]) % 2) == 0 )){
                    finalOutput +=   "*" + splitString[i + 1];
                } else if (((Integer.parseInt(splitString[i]) % 2) == 1) && ((Integer.parseInt(splitString[i + 1]) % 2) == 1)){
                    finalOutput += "-" + splitString[i + 1];
                } else {
                    finalOutput += splitString[i] +  splitString[i + 1];
                }
            }

            return finalOutput.toString();


        }

}
