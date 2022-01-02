package com.zhialex.hw.hw3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cat implements Animals {

    private String name;
    private int age;

    @Override
    public void eat() {
        System.out.println("the cat lapping milk");
    }

    @Override
    public void move() {
        System.out.println("the cat runs around the house at night");
    }

    @Override
    public void askName() {
        System.out.println("the cat's name is " + name);
    }

    @Override
    public void askAge() {
        System.out.println("the cat's age is " + age);
    }
}
