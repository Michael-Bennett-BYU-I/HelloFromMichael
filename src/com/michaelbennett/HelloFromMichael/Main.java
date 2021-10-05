package com.michaelbennett.HelloFromMichael;

public class Main {
    private static final String myName = "Michael Bennett";

    public static void main(String[] args) {
        printMyName();
    }

    public static void printMyName() {
        System.out.println("Hello, my name is " + myName);
        System.out.println("All your base are belong to us!\n");
    }

    private static void printYourName(String classmatesName) {
        System.out.format("Hello %s, my name is %s.", myName, classmatesName);
    }
}
