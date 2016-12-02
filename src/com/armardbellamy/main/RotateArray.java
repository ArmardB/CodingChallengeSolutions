package com.armardbellamy.main;


public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] rand;

        rand = rotateArray(nums, 3);

        for(int i = 0; i < rand.length; i++){
            System.out.println(rand[i]);
        }
        System.out.println();
    }

    public static int[] rotateArray(int[] arr, int numberOfRotations){

        for(int i = 0; i < numberOfRotations; i++){
            for(int j = arr.length -1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }

        }

            return arr;
    }
}
