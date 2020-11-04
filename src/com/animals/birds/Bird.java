package com.animals.birds;

import com.animals.Animal;

public class Bird extends Animal {
    private String featherColor;

    @Override
    public void move(){
        System.out.println("I'm flying");
    }

    @Override
    public void feed(){
        System.out.println("I'm eating fish");
    }
    @Override
    public void sound(){
        System.out.println("I'm sound bird");
    }

    public void nesting() {
        System.out.println("Without Override: I'm nesting");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
