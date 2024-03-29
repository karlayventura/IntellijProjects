package com.syntax.class24;

class Student{
    void study(){
        System.out.println("Student must study to pass");
    }
    void doHomeWork(){
        System.out.println("Students must do homeworks");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Syntax students must solve repls");
    }

    @Override
    void practice() {
        System.out.println("Syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomeWork() {
        System.out.println("College students can skip some of the homewords");
    }
}
class SchoolStudent extends Student{

}

public class Task1 {
    // Create a class student that will have 3 subclasses
    // as SyntaxStudent, CollageStudent, SchoolStudent.
    // Define common behavior within parent class & override some of the methods in child classes.
    // Define some methods specific to child classes
    // Write example of achieving run time polymorphism
}
