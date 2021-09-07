package com.jerichocalica;

public class TestHuman {

    //call these in main
    String name;
    int age;
    double weight;

    TestHuman(String identity, int age, double weight) {

        this.name = identity; //in main: human1.name
        this.age = age; //in main: human1.age
        this.weight = weight; //in main: human1.weight
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }
    void drink() {
        System.out.println(this.name + " is drinking.");
    }
}
