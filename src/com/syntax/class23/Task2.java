package com.syntax.class23;

public class Task2 {
    // Create class with a static method that has 3 overload forms
    public static void method(String name) {
        System.out.println("1");
    }
    public static void method(boolean bol) {
        System.out.println("2");
    }
    public static void method(int num) {
        System.out.println("3");
    }

    public static void main(String[] args) {
        method(true);
        method(15);

    }
}
