package com.example.shapy;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Animals {
    public static ArrayList<Animal> loadAnimals(String fileName){
        List<String> lns;
        try {
            lns = Files.readAllLines(Path.of(fileName));
        }
        catch (Exception e){
            return null;
        }
        ArrayList<Animal> animalList= new ArrayList<>();
        for (String line:lns) {
            String[] words = line.split("//w");
            Animal animal;
            if (words[0].equals("Тигр")) {
                animal = new Tiger(words[1]);
            } else if (words[0].equals("Котик")) {
                animal = new Cat(words[1]);
            } else if (words[0].equals("Осел")) {
                animal = new Donkey(words[1]);
            } else if (words[0].equals("Собака")) {
                animal = new Dog(words[1]);
            } else if (words[0].equals("Карась")) {
                animal = new CrucianCarp(words[1]);
            } else {
                animal = new Animal("Ошибка");
            }
            animalList.add(animal);
            }
        return animalList;
    }
}
