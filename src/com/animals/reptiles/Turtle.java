package com.animals.reptiles;

public class Turtle extends Reptile{
    @Override
    public void move() {
        System.out.println("I'm walking very slowly");
    }

    @Override
    public void sound() {
        System.out.println("Sound of turtle");
    }
}
