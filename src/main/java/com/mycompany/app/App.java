package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }
    private final String getMessage1() {
        return "This is to test1";
    }
    private final String getMessage2() {
        return "This is to test2";
    }
}
