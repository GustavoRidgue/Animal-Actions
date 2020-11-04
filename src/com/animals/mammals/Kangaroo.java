package com.animals.mammals;

public class Kangaroo extends Mammal {
    @Override
    public void move() {
        System.out.println("I'm jumping");
    }

    @Override
    public void sound() {
        System.out.println("Sound of kangaroo");
    }

    public void useBag() {
        System.out.println("Without Override: I'm using my bag");
    }
}
