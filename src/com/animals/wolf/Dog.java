package com.animals.wolf;

public class Dog extends Wolf {
    @Override
    public void sound() {
        System.out.println("Sounding auau");
    }

    public void buryBone() {
        System.out.println("I'm burying my bone");
    }

    public void wagTail() {
        System.out.println("I'm waging my tail");
    }
}
