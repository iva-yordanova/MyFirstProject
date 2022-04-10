package com.homework_2;

import java.util.Scanner;

public class CalculateRevenue {
    public static void main(String[] args) {
        System.out.println("Enter unit price: ");
        Scanner myUnitPrice = new Scanner(System.in);
        double unitPrice = myUnitPrice.nextDouble();
        System.out.println("Unit price is " + unitPrice);

        System.out.println("Enter quantity: ");
        Scanner myProductQuantity = new Scanner(System.in);
        int productQuantity = myProductQuantity.nextInt();
        System.out.println("Product quantity is " + productQuantity);

        double discount = 0;
        //double revenue = (productQuantity * unitPrice) - discount;

        if (productQuantity < 100) {
            discount = ((productQuantity * unitPrice) * 0 / 100);
            System.out.println("Discount " + discount + " (0%)");
        }

        else if (100 <= productQuantity && productQuantity <= 120) {
            discount = ((productQuantity * unitPrice) * 15 / 100);
            System.out.println("Discount: " + discount + " (15%)");
        }
        else if (productQuantity > 120) {
            discount = ((productQuantity * unitPrice) * 20 / 100);
            System.out.println("Discount: " + discount + " (20%)");
        }
      
        System.out.println("The revenue from sale: " + ((productQuantity * unitPrice) - discount) + "$");
    }
}



