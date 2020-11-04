package com.animals.mammals;

import com.animals.Animal;

public class Mammal extends Animal {
    private String furColor;

    @Override
    public void move(){
        System.out.println("I'm running");
    }

    @Override
    public void feed(){
        System.out.println("I'm eating meat");
    }
    @Override
    public void sound(){
        System.out.println("I'm sound mammal ");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
