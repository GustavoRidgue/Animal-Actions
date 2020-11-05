package com.animals;

public abstract class Animal {
    protected float weight;
    protected int age;
    protected int members;

    public abstract void move();

    public void feed() {
        System.out.println("I'm eating food");
    }

    public void sound() {
        System.out.println("I'm making a sound");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }
}
