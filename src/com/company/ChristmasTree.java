package com.company;

public class ChristmasTree {

    public static void main(String[] args) {
        System.out.println();
        double treeHeight = 10.5;
        christmasTree(treeHeight);
    }

    static void christmasTree(double treeHeight) {
        for (double i = 1; i <= treeHeight; i++)
        {
            for (double j = treeHeight - i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for (double k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
