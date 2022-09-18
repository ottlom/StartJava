package com.startjava.lesson_2_3.person;

public class Person {
    char gender = 'M';
    String name = "Maks";
    int height = 171;
    float weight = 74.8f;
    int age = 25;

    public void walk() {
        System.out.println(name + " идёт пешком");
    }

    public void sit() {
        System.out.println(name + " сидит");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void speak() {
        System.out.println(name + " говорит");
    }

    public void studyJava() {
        System.out.println(name + " изучает Java");
    }
}