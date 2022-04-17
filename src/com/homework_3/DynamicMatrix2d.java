package com.homework_3;

import java.util.Scanner;

public class DynamicMatrix2d {

    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        Scanner matrix = new Scanner(System.in);
        int rows = matrix.nextInt();
        int columns = matrix.nextInt();

        if (rows == 0 || columns == 0) {
            System.out.println("This is not a valid array");
        } else {
            System.out.println("Enter array elements : ");

            int[][] twoD = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    twoD[i][j] = matrix.nextInt();
                }
            }
            System.out.print("Data you entered: \n");

            for (int[] x : twoD) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        }
    }
}


