package com.homework_3;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {200,434,777,666};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
