package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj index: ");
        int liczba = Integer.parseInt(reader.readLine());
        ArrayList<Integer> lista = new ArrayList<>();

        if (liczba == 0 || liczba == 1) {
            System.out.println(liczba);
        } else {
            int x1 = 0;
            int x2 = 1;
            lista.add(x1);
            lista.add(x2);
            for (int i = 2; i < liczba; i++) {
                int x = lista.get(i - 2) + lista.get(i - 1);
                lista.add(x);
            }
            for (int i: lista) {
                System.out.println(i);
            }

        }






    }
}
