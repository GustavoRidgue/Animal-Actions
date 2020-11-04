package com.animals.fishes;

import com.animals.Animal;

public class Fish extends Animal {
    private String scaleColor;

    @Override
    public void move(){
        System.out.println("I'm swimming");
    }

    @Override
    public void feed(){
        System.out.println("I'm eating substances");
    }
    @Override
    public void sound(){
        System.out.println("I'm don't make sound");
    }

    public void dropBubble() {
        System.out.println("Without Override: I'm dropping bubbles");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
