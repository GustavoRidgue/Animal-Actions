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

    public void growl() {
        System.out.println("I'm growling");
    }

    public void react(String phrase) {
        if (phrase.equals("Olá") || phrase.equals("Oi")) {
            sound();
            wagTail();
        } else {
           growl();
        }
    }

    public void react(int hour, int minute) {
        if (hour < 12) {
            wagTail();
        } else if (hour >= 18){
            System.out.println("I'm ignoring");
        } else {
            sound();
            growl();
        }
    }

    public void react(boolean owner) {
        if (owner) {
            sound();
            wagTail();
        } else {
            growl();
        }
    }

    public void react(int age, float weight) {
        if (age <= 5) {
            if (weight <= 20) {
                wagTail();
            }
            sound();
        } else {
            if (weight > 20) {
                sound();
            } else {
                sound();
                growl();
            }
        }
    }
}
