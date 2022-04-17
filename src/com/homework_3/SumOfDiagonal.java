package com.homework_3;

import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        Scanner matrix = new Scanner(System.in);
        int rows = matrix.nextInt();
        int columns = matrix.nextInt();
        int sum1 = 0;
        int sum2 = 0;
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

            for (int[] i : twoD) {
                for (int j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for (int a = 0; a < rows; a++) {
                for (int b = 0; b < columns; b++) {
                    if(a==b) {
                        sum1 += twoD[a][b];
                    }
                }
            }
            System.out.println("Sum of the first diagonal elements of the matrix = " + sum1);

            for (int a = 0; a < rows; a++) {
                for (int b = columns - 1; b >=0; b--) {
                    if(a + b == twoD.length - 1) {
                        sum2 += twoD[a][b];
                    }
                }
            }
            System.out.println("Sum of the second diagonal elements of the matrix = " + sum2);

        }
    }
}


