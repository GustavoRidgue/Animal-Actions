package com.animals;

import com.animals.birds.Bird;
import com.animals.birds.BlueArara;
import com.animals.fishes.Fish;
import com.animals.fishes.Goldfish;
import com.animals.wolf.Dog;
import com.animals.mammals.Kangaroo;
import com.animals.mammals.Mammal;
import com.animals.reptiles.Reptile;
import com.animals.reptiles.Snake;
import com.animals.reptiles.Turtle;
import com.animals.wolf.Wolf;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        BlueArara blueArara = new BlueArara();
        Fish fish = new Fish();
        Goldfish goldfish = new Goldfish();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Kangaroo kangaroo = new Kangaroo();
        Reptile reptile = new Reptile();
        Snake snake = new Snake();
        Turtle turtle = new Turtle();

        bird.sound();
        blueArara.sound();
        fish.sound();
        goldfish.sound();
        mammal.sound();
        dog.sound();
        wolf.sound();
        kangaroo.sound();
        reptile.sound();
        snake.sound();
        turtle.sound();

        dog.react("oi");
        dog.react(22, 50);
        dog.react(6, 40);
        dog.react(false);
    }
}
