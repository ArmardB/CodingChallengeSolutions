package com.armardbellamy.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by armardbellamy on 11/26/16.
 */
public class MinAndMaxOfArray {

    // Write a Java program to find the maximum and minimum value of an array



    public static void main(String[] args) {

        int[] someNumbers = {23, 12, 2432, 2342, 1231, 2341, 324, 123123};
        int smallest = 0;
        int largest = 0;

//        Arrays.sort(someNumbers);
//
//        smallest = someNumbers[0];
//        largest = someNumbers[someNumbers.length - 1];
//
//        System.out.println("Smallest: " + smallest + " Largest: " + largest);

        for(int i = 0; i < someNumbers.length -1 ; i++){
            int temp = someNumbers[i];
            if (someNumbers[i] > someNumbers[i + 1]) {
                someNumbers[i + 1] = temp;

            }
        }
        for(int num: someNumbers){
            System.out.print(num + " ");
        }

        smallest = someNumbers[0];
        largest = someNumbers[someNumbers.length - 1];

        System.out.println("Smallest: " + smallest + " Largest: " + largest);






    }


}
