package com.company;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a, b, c:");

        double a = myObj.nextDouble();
        double b = myObj.nextDouble();
        double c = myObj.nextDouble();
        double determinant = b * b - 4 * a * c;
        double x = (-b + Math.sqrt(determinant)) / (2 * a);

        System.out.println(x);
    }
}
