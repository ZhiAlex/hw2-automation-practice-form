package com.zhialex.hw.hw3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Fish implements Animals {

    private String name;
    private int age;

    @Override
    public void eat() {
        System.out.println("the fish is eating something");
    }

    @Override
    public void move() {
        System.out.println("the fish swims");
    }

    @Override
    public void askName() {
        System.out.println("the fish's name is " + name);
    }

    @Override
    public void askAge() {
        System.out.println("the fish's age is " + age);
    }
}
