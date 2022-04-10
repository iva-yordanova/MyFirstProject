package com.homework_2;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter the number corresponding to the day of the week: ");
        int dayOfTheWeekNumber = myscanner.nextInt();
        String dayOfTheWeek = new String();
        String dayOfTheWeekEnding = new String();
        boolean isValidDay = true;

            switch (dayOfTheWeekNumber) {
                case 1:
                    dayOfTheWeek = "Monday";
                    dayOfTheWeekEnding = "-st";
                    break;
                case 2:
                    dayOfTheWeek = "Tuesday";
                    dayOfTheWeekEnding = "-nd";
                    break;
                case 3:
                    dayOfTheWeek = "Wednesday";
                    dayOfTheWeekEnding = "-rd";
                    break;
                case 4:
                    dayOfTheWeek = "Thursday";
                    dayOfTheWeekEnding = "-th";
                    break;
                case 5:
                    dayOfTheWeek = "Friday";
                    dayOfTheWeekEnding = "-th";
                    break;
                case 6:
                    dayOfTheWeek = "Saturday";
                    dayOfTheWeekEnding = "-th";
                    break;
                case 7:
                    dayOfTheWeek = "Sunday";
                    dayOfTheWeekEnding = "-th";
                    break;
                default:
                    System.out.println("This is not a valid day.");
                    isValidDay = false;
            }
            if (isValidDay) {
                System.out.println("The " + dayOfTheWeekNumber + dayOfTheWeekEnding + " day of the week is " + dayOfTheWeek);
            }
        }
    }

   /* if (dayOfTheWeekNumber == (int)dayOfTheWeekNumber)
            {
            }
            else {
            System.out.println("Please enter an integer!");
            }
*/


