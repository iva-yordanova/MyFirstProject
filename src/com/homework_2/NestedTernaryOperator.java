package com.homework_2;

public class NestedTernaryOperator {
    public static void main(String[] args) {
        int a = 1, b = 2, ans;
        /*if (a == 1) {
            if (b == 2) {
                ans = 3;
            } else {
                ans = 5;
            }
        } else {
            ans = 0;
        }
        System.out.println(ans);*/

        ans = a == 1 ? (b == 2 ? 3 : 5) : 0;
        System.out.println(ans);
    }
}