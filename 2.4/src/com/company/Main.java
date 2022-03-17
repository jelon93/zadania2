package com.company;
import com.company.Person;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

    ArrayList<Person> arr = new ArrayList<>();
    arr.add(new Person("Jasiek"));
    arr.add(new Person("Heniek"));
    arr.add(new Person("Antek"));
    arr.add(new Person("Olek"));
    arr.add(new Person("Anna"));
    arr.add(new Person("Robert"));

    Iterator<Person> iter = arr.iterator();
    while (iter.hasNext()) {
        String x = String.valueOf(iter.next().name.charAt(0));
        if (x.equals("A") || x.equals("a")) {
            iter.remove();
        }
    }

    for (Person p:arr) {
            System.out.println(p.name);
    }

    }
}


