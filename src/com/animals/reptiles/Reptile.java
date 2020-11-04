package com.animals.reptiles;

import com.animals.Animal;

public class Reptile extends Animal {
    private String scaleColor;

    @Override
    public void move(){
        System.out.println("I'm dragging");
    }

    @Override
    public void feed(){
        System.out.println("I'm eating stone");
    }
    @Override
    public void sound(){
        System.out.println("I'm sound reptile");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
