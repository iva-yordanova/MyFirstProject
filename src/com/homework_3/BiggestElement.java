package com.homework_3;

import java.util.ArrayList;
import java.util.Collections;

public class BiggestElement {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1190);
        number.add(200);
        number.add(1199);
        number.add(100);

        System.out.println(Collections.max(number));
    }
}
