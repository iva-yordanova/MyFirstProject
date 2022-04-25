package com.homework_4;

import java.util.Scanner;

public class SmallestNumber {
    public static int returnSmallest(int firstNumber, int secondNumber, int thirdNumber) {
        return Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstNumber = myScanner.nextInt();
        int secondNumber = myScanner.nextInt();
        int thirdNumber = myScanner.nextInt();

        System.out.println(returnSmallest(firstNumber,secondNumber,thirdNumber));

    }
}
