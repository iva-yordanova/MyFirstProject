package com.homework_2;

import java.util.Scanner;

public class EligibleToWork {

    public static void main(String[] args) {
            System.out.println("Enter your age: ");
            Scanner myScanner = new Scanner(System.in);
            int age = myScanner.nextInt();

        if(age<=0){
            System.out.println("Please, enter a valid age!");
        }
        else{
            if (age >= 16) {
                System.out.println("You are eligible to work.");
            } else {
                System.out.println("You are not eligible to work.");
            }
        }
    }
}
