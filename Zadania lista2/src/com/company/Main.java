package com.company;
import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(String.valueOf(i));
        }

        arr.set(5,"99");
        arr.remove(0);
        arr.remove(0);
        arr.remove(0);
        arr.remove(4);
        arr.remove(4);
        arr.remove(4);

        for (int i = 0; i < 6; i++) {
            arr.add(i+"a");
        }

        Collections.sort(arr);

        for (String s:arr) {
            arr2.add(0,s);
        }

        for (String s:arr2) {
            System.out.println(s);
        }

    }
}
