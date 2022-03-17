package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[] {0,0,0,0,0};

        for (int i = 0; i < 5; i++) {
            System.out.print("Wprowadź liczbę o indeksie " + i + ": ");
            int x = Integer.parseInt(reader.readLine().toString());
            arr[i] = x;
        }


        int len = arr.length;
        while (len >= 1) {
            for (int i=0; i<len-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int j = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = j;
                }
            }
            len--;
        }

        for (int i: arr) {
            System.out.print(i + " ");
        }

    }
}