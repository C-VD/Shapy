package com.example.shapy;

import java.util.ArrayList;

class Animal {
    String name;
    ArrayList<String> voices;
    public Animal(String name){
        this.name = name;
        voices = new ArrayList<>();
    }

    public ArrayList<String> getVoices(){
        return voices;
    }
}
