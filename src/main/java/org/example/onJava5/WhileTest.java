package org.example.onJava5;

public class WhileTest {
    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited while");
    }
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result+" , ");
        return result;
    }
}
