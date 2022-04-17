package com.homework_3;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {200,434,777,666};
        int sum = 0;

//foreach loop
        /*for (int i:arr) {
            sum += i;
        }
        System.out.println(sum);*/

//normal loop
      for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}

//Same task but with arraylist

/*
import java.util.ArrayList;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int sum =0;
        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(200);
        numbers.add(434);
        numbers.add(777);
        numbers.add(666);
        numbers.set(0,199);
        for (int i:numbers
             ) {
             sum += i;
        }
        System.out.println(sum);
    }
}*/
