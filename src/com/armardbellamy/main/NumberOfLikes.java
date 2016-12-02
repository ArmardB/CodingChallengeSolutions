package com.armardbellamy.main;

import java.util.Scanner;

/**
 * Created by armardbellamy on 11/9/16.
 */
public class NumberOfLikes {


        public static void main(String args[] ) throws Exception {

            Scanner scanner = new Scanner(System.in);
            int numberOfDays = scanner.nextInt();
            int numberOfPeople = 5;
            int numberOfLikes = 0;



            for(int i = 0; i < numberOfDays; i++){
                numberOfPeople = (int) Math.floor(numberOfPeople / 2);
                numberOfLikes +=  numberOfPeople;
                numberOfPeople *= 3;
            }

            System.out.println(numberOfLikes);
        }
}
