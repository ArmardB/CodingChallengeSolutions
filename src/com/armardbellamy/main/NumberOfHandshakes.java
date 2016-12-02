package com.armardbellamy.main;

/**
 * Created by armardbellamy on 11/10/16.
 */
public class NumberOfHandshakes {

    // Given 20 people in the room, determine the number of

    public static void main(String[] args) {
        System.out.println(numberOfHandshakes(20));
    }

    public static int numberOfHandshakes(int peopleInTheRoom){
        return ( peopleInTheRoom * (peopleInTheRoom - 1 ) / 2);
    }


}
