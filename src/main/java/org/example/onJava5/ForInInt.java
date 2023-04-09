package org.example.onJava5;

import static onjava.Range.*;

public class ForInInt {
    public static void main(String[] args) {
        for (int i : range(10))
            System.out.print(i + " ");
        System.out.println();
        for (int i : range(5, 10))
            System.out.print(i + " ");
        System.out.println();
        for (int i : range(5,20,3))
            System.out.print(i + " ");
        System.out.println();
        for (int i : range(20,5,-3))
            System.out.print(i + " ");
        System.out.println();
    }
}
