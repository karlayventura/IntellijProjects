package com.syntax.class16;

public class StringDemo1 {
    public static void main(String[] args){

        // .replace method
        String str="Batch 12 is good";
        System.out.println(str.replace("good", "Great"));
        System.out.println(str.replace("o", "0"));
        System.out.println(str.replace(" ", "_"));
        System.out.println(str.replace(" ", "")); //Removal of space
        System.out.println(str.replace("12", "13"));

    }
}
