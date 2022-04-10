package com.homework_2;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr ={2,11,45,9};
        var max = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with max
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
