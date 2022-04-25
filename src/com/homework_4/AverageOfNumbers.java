package com.homework_4;

import java.util.Scanner;

public class AverageOfNumbers {
    public static double averageOfNumbers(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return (sum / numbers.length);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numbers = myScanner.nextInt();

        if (numbers == 0) {
            System.out.println("This is not a valid array");
        } else {
            System.out.println("Enter array elements : ");

            int[] ArrayNumbers = new int[numbers];
            for (int i = 0; i < ArrayNumbers.length; i++) {
                ArrayNumbers[i] = myScanner.nextInt();
            }

            System.out.println(averageOfNumbers(ArrayNumbers));
        }
    }
}
