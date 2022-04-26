package com.homework_5;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int firstNumber = myScanner.nextInt();
        int secondNumber = myScanner.nextInt();

        try {
            System.out.println(firstNumber / 0);
            System.out.println(secondNumber / 0);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
