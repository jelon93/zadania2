package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Podaj zakres liczbowy (max 100): ");
        Integer x = Integer.parseInt(reader.readLine());
        System.out.print("Podaj ilość liczb: ");
        Integer y = Integer.parseInt(reader.readLine());

        //generowanie y liczb
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < y; i++) {
            Random random = new Random();
            arr.add(random.nextInt(x));
        }

        //liczba wystąpień

        for (Integer i: arr) {
            System.out.print(i+",");
        }
        System.out.println("");

        //mapa
        Map<Integer,Integer> mapaLiczb = new HashMap<>();
        for (Integer i:arr) {
            mapaLiczb.put(i,Collections.frequency(arr,i));
        }

        Set<Map.Entry<Integer,Integer>> entries = mapaLiczb.entrySet();
        Iterator<Map.Entry<Integer,Integer>> entriesIterator = entries.iterator();

        while (entriesIterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = entriesIterator.next();
            System.out.print(entry.getKey() + " , " + entry.getValue());
            System.out.println();
        }


    }
}
