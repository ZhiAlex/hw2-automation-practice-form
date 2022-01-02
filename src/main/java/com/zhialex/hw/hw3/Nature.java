package com.zhialex.hw.hw3;

public class Nature {

    public static void main(String[] args) {

        Bird bird = Bird.builder().name("Cheburek").age(2).build();
        Cat cat = Cat.builder().name("Listik").age(8).build();
        Fish fish = Fish.builder().name("Vasuan").age(1).build();

        bird.askName();
        bird.askAge();
        bird.eat();
        bird.move();

        cat.askName();
        cat.askAge();
        cat.eat();
        cat.move();

        fish.askName();
        fish.askAge();
        fish.eat();
        fish.move();

    }
}
