package com.homework_3;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverseOrder {
    public static void main(String[] args) {
        LinkedList <Integer> number=new LinkedList<>();

        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        //number.set(2,9);
        boolean myBoolean = number.contains(6);

        if (myBoolean==true){
            Collections.reverse(number);
            System.out.println(number);
        }
        else{
            System.out.println("The array doesn't contain 6");
        }
        }

    }

