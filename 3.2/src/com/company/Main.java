package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
    double x = Math.random()*1000;
    int random = (int) x;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Podaj liczbę: ");
    int type = Integer.parseInt(reader.readLine());

    while (type != random) {
        if (type > random) {
            System.out.println("Za dużo!");
            System.out.print("Podaj liczbę: ");
            type = Integer.parseInt(reader.readLine());
        } if (type < random) {
            System.out.println("Za mało!");
            System.out.print("Podaj liczbę: ");
            type = Integer.parseInt(reader.readLine());
        }
    }

    System.out.println("Bingo");

    }
}
