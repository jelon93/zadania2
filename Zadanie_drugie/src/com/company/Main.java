package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> imiona = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            System.out.print("Podaj imię pieska numer " + (i+1) + ": ");
            String imie = reader.readLine();
            imiona.add(imie);
        }

        System.out.print("Piesek " + imiona.get(0) + " podrapał po plecach pieska " + imiona.get(1) + " następnie piesek " + imiona.get(2) + " zabrał gumową kość której właścicielem był " + imiona.get(3) + " a nastepnie podbiegł się przywitać z pieskami o imionach " + imiona.get(4) + " oraz " + imiona.get(5) + " przy okazji trącając ogonkiem pieska " + imiona.get(6) + " oraz " + imiona.get(7) + " .");


    }
}
