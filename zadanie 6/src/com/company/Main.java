package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj cenę towaru (Max.50000): ");
        int cena = Integer.parseInt(reader.readLine());
        System.out.print("Podaj liczbę rat (Max.48): ");
        int raty = Integer.parseInt(reader.readLine());

        if (cena <= 50000 && raty <= 48) {
            if (raty <= 12) {
                double x = cena/raty*1.03;
                System.out.println(x);
            } if (raty > 12 && raty <= 24) {
                double x = cena/raty*1.06;
                System.out.println(x);
            } if (raty > 24) {
                double x = cena/raty*1.1;
                System.out.println(x);
            }
        }
    }
}
