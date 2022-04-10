package com.homework_2;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        System.out.println("Enter vacation place (Beach, Mountain):");
        Scanner myVacation = new Scanner(System.in);
        String vacationPlace = myVacation.nextLine();
        System.out.println("My chosen place is " + vacationPlace);

        System.out.println("Enter budget:");
        Scanner mybudget = new Scanner(System.in);
        Double budget = mybudget.nextDouble();
        System.out.println("My budget is " + budget);

        String option1 = "Beach";
        String option2 = "Mountain";

        if (vacationPlace == option1 || vacationPlace == option2) {
            if (vacationPlace == option1) {
                if (budget < 50) {
                    System.out.println("You should choose Bulgaria as a destination");
                } else {
                    System.out.println("You should choose a place outside Bulgaria as a destination");
                }
            }
            if (vacationPlace == option2) {
                if (budget < 30) {
                    System.out.println("You should choose Bulgaria as a destination");
                } else {
                    System.out.println("You should choose a place outside Bulgaria as a destination");
                }
            }
        } else {
            System.out.println("There is no information about this type of vacation.");
        }
    }
}
