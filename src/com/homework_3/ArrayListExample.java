package com.homework_3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0);
        cars.add("Tesla");
        cars.set(3,"Volvo");
        System.out.println(cars);
        Collections.sort(cars);
            
        }
    }

