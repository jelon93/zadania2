package com.company;
import java.lang.Math;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Podaj wartość promienia: ");
    double r = Double.parseDouble(reader.readLine());

    double objetosc = 4.0 / 3.0 * Math.PI * Math.pow(r,3);
    System.out.println("Objętość kuli o promieniu " + r + " wynosi: " + objetosc + " jednostek sześciennych.");

    double powierzchnia = 4.0 * Math.PI * Math.pow(r,2);
        System.out.println("Pole kuli o promieniu " + r + " wynosi: " + powierzchnia + " jednostek kwadratowych.");

    }
}
