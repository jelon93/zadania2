package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<Person> arr = new ArrayDeque<>();
        registerUser("Jasiek", arr);
        registerUser("Kasia", arr);
        registerUser("Witek", arr);
        registerUser("Jola", arr);
        registerUser("Baśka", arr);
        callNextUser(arr);
        callNextUser(arr);
        callNextUser(arr);
    }

    public static void registerUser (String name, Deque<Person> arr) {
        Person person = new Person(name);
        arr.add(person);
    }

    public static void callNextUser (Deque<Person> arr) {
        arr.pop();
        System.out.println(arr.getFirst().name + ", twoja kolej!");
    }

}
