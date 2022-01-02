package com.zhialex.hw.hw3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bird implements Animals {

    private String name;
    private int age;

    @Override
    public void eat() {
        System.out.println("the bird pecks seeds");
    }

    @Override
    public void move() {
        System.out.println("the bird flies");
    }

    @Override
    public void askName() {
        System.out.println("the bird's name is " + name);
    }

    @Override
    public void askAge() {
        System.out.println("the bird's age is " + age);
    }
}
