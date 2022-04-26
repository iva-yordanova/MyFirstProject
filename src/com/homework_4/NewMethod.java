package com.homework_4;


import java.util.Scanner;

public class NewMethod {

    static boolean isEven(int number) {
        boolean result = true;
        if (number % 2 == 0) {
            System.out.println("The number is even");
            return result;
        } else {
            System.out.println("The number is odd");
            return !result;
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int myNumber = myScanner.nextInt();
        System.out.println(isEven(myNumber));
    }
}

