package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean zmienna = true;
        int wynik = 0;

        while (zmienna) {

            System.out.print("Podaj pierwszę liczbę: ");
            int liczba1 = Integer.parseInt(reader.readLine());
            System.out.print("Podaj rodzaj operacji (+,-,*,/): ");
            String operacja = reader.readLine();
            System.out.print("Podaj drugą liczbę: ");
            int liczba2 = Integer.parseInt(reader.readLine());


            if (operacja.equals("+")) {
                wynik = liczba1 + liczba2;
                System.out.println("Wynik dodawania: " + wynik);
                zmienna = false;
            }
            if (operacja.equals("-")) {
                wynik = liczba1 - liczba2;
                System.out.println("Wynik odejmowania: " + wynik);
                zmienna = false;
            }
            if (operacja.equals("*")) {
                wynik = liczba1 - liczba2;
                System.out.println("Wynik mnożenia: " + wynik);
                zmienna = false;
            }
            if (operacja.equals("/")) {
                wynik = liczba1 / liczba2;
                System.out.println("Wynik dzielenia: " + wynik);
                zmienna = false;
            } else if (zmienna){
                System.out.println("Niedozwolona operacja, spróbuj jeszcze raz.");
            }

        }

    }
}
