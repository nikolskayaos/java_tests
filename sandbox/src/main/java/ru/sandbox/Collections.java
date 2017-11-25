package ru.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main (String[] args){
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Swing");
        languages.add("Python");
        languages.add("PHP");

        for (String l : languages){
            System.out.println("I want to learn " + l);
        }
        System.out.println("Size of collection " + languages.size());
}
}
