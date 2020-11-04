package com.animals.reptiles;

public class Snake extends Reptile{
    @Override
    public void move() {
        System.out.println("I'm crawling");
    }

    @Override
    public void sound() {
        System.out.println("Sound of snake");
    }
}
