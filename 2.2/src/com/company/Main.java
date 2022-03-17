package com.company;
import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	HashSet<Integer> arr1 = new HashSet<>();
    TreeSet<Integer> arr2 = new TreeSet<>();

    arr1.add(1);
    arr1.add(5);
    arr1.add(36);
    arr1.add(178);
    arr1.add(44);

    arr2.add(5);
    arr2.add(4);
    arr2.add(36);
    arr2.add(222);
    arr2.add(33);
    int comp = 0;

    // Ilość takich samych elementów
    for (Integer i:arr1) {
        if (arr2.contains(i)) {
            comp++;
        }
    }

    // Suma
    TreeSet<Integer> arr3 = new TreeSet<>();

    for (Integer i:arr1) {
        arr3.add(i);
    }

    for (Integer i:arr2) {
        arr3.add(i);
    }

    //roznica
    TreeSet<Integer> arr4 = new TreeSet<>();

    for (Integer i:arr1) {
        arr4.add(i);
    }
    for (Integer i:arr2) {
        if (arr4.contains(i)) {
            arr4.remove(i);
        }
    }

    //czescWspolna
    TreeSet<Integer> arr5 = new TreeSet<>();
    for (Integer i: arr1) {
        if (arr2.contains(i)) {
            arr5.add(i);
        }
    }

    }
}
