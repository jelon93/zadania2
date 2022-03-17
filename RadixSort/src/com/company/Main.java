package com.company;

public class Main {

    public static int getMax(int arr[], int n) {

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
	    System.out.println(539%10);
    }
}
