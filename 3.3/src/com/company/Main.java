package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] tablica = new int[6];
        ArrayList<Integer> arr = new ArrayList<>(6);
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
                while (true) {
                    int z = random.nextInt(50) + 1;
                    if (!arr.contains(z)) {
                        arr.add(z);
                        tablica[i] = z;
                        break;
                    }
                }
        }

        for (int i:tablica) {
            System.out.print(i + ",");
        }

        }
    }
