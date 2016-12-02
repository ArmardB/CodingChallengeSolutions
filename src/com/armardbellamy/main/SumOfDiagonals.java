package com.armardbellamy.main;


import java.util.*;

public class SumOfDiagonals {

    public static void main(String[] args) {
        int[][] numbers = new int[][]{
                {1,2,3},
                {2,3,4},
                {2,5,6}
        };

        System.out.println(sumOfArrayDiagonals(numbers));
    }
    public static int sumOfArrayDiagonals(int[][] arr){
        int sum = 0;

        for(int i = 0; i < 1; i++){
                sum += arr[i][i] + arr[i+1][i+1] + arr[i+2][i+2];
                sum += arr[i][i+2] + arr[i+1][i+1] + arr[i+2][i];
        }

        return sum;
    }

}


