package com.homework_4;

import java.util.Scanner;

public class MiddleChar {
    public static String getMiddle(String myString) {
        int position = 0;
        int length = 0;
            if (myString.length() % 2 == 0) {
                position = myString.length() / 2 - 1;
                length = 2;
            } else {
                position = myString.length() / 2;
                length = 1;
            }
        return myString.substring(position, position + length);
    }

    public static int countWords(String myString) {
        if (myString == null || myString.isEmpty()) {
            return 0;
        } else {
            String[] words = myString.split(" ");
            return words.length;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string: ");
        String myString = in.nextLine();
        System.out.println(myString.length());
        System.out.println("The count of all words in a string: " + countWords(myString));
        if (myString.length() <= 2) {
            System.out.println("There isn't a middle char");
        } else {
            System.out.println("The middle character in the string: " + getMiddle(myString));
        }
    }
}
