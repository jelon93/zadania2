package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Minimalna wartość zakresu: ");
        Integer minLiczba = Integer.parseInt(reader.readLine());
        System.out.print("Maksymalna wartość zakresu: ");
        Integer maxLiczba = Integer.parseInt(reader.readLine());
        System.out.print("Wylosowana liczba to: ");
        System.out.print((int)(Math.random()*(maxLiczba-minLiczba))+minLiczba);
    }
}
