package org.example.onJava6;

public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this; // 返回当前对象
    }
    void printf() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().printf(); // 链式调用，可以更方便操作
    }
}
