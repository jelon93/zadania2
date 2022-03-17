package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = new int[] {68, 22, 1, 7, 0, 12};

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
