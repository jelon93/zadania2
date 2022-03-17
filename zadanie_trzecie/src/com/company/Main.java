package com.company;

import java.sql.Array;
import java.util.*;


public class Main {

    public static void main(String[] args)  {

    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(12);
    arr.add(5);
    arr.add(20);
    arr.add(10);
    arr.add(6);
    arr.add(11);
    arr.add(35);

        for (int i: arr) {
            System.out.println(i);
        }

    int x = 0;
    int y = 1;

    while (y < arr.size()) {
        while(arr.get(x) > arr.get(y) && x >= 0) {
            arr.add(x,arr.get(y));
            arr.remove(y);
            if (x == 0) {
                break;
            } else {
                x--;
            }
        }
        y = y+1;
        x = y-1;
    }

        for (int i: arr) {
            System.out.println(i);
        }

    }
}