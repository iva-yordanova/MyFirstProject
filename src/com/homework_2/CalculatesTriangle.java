package com.homework_2;

import java.util.Scanner;

public class CalculatesTriangle {
    public static void main(String[] args) {
        Scanner angles = new Scanner(System.in);
        System.out.println("Enter the values for the triangle's angles: ");
        int angleA = angles.nextInt();
        int angleB = angles.nextInt();
        int angleC = angles.nextInt();
        int sum = angleA + angleB + angleC;

        System.out.println("The sum of the triangle's angles is " + sum);

        if (angleA <= 0 || angleB <= 0 || angleC <= 0) {
            System.out.println("The triangle is invalid due to negative or equal to zero value");
        } else {
            if (sum != 180) {
                System.out.println("The triangle is invalid due to sum less/bigger than 180");
            } else {
                System.out.println("The triangle is valid ");
                if (angleA < 90 && angleB < 90 && angleC < 90) {
                    System.out.println("The triangle is acute ");
                }
                if (angleA == 90 || angleB == 90 || angleC == 90) {
                    System.out.println("The triangle is right-angled");
                }
                if (angleA > 90 || angleB > 90 || angleC > 90) {
                    System.out.println("The triangle is obtuse");
                }
                if (angleA == 60 && angleB == 60 && angleC == 60) {
                    System.out.println("The triangle is equilateral");
                }
                if (angleA == angleB || angleA == angleC || angleB == angleC) {
                    System.out.println("The triangle is isosceles");
                }
                if (angleA != angleB || angleA!= angleC || angleB!=angleC) {
                    System.out.println("The triangle is multifaceted");
                }
            }
        }
    }
}



