package com.syntax.class20;

public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }
    public Frog(String name, String color, int age, double weight) {
        // this() should be the first line inside the constructor body,
        this(name, color, age);
        this.weight = weight;
    }
    void printInfo(){
        // this() not allowed inside the methods
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
