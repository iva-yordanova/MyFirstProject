package com.homework_1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter height and base:");

        double height = myObj.nextDouble();
        double base = myObj.nextDouble();
        double area = (height * base) / 2;

        System.out.println("The area of a triangle is" + " " + area);
    }
}
