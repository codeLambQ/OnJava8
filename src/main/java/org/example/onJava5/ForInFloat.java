package org.example.onJava5;

import java.util.Random;

public class ForInFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = random.nextFloat();
        }
        for (float x : f) { // 定义一个变量 x ，每次循环把 f 数组里的数据赋值给 x;
            System.out.print(x + " ");
        }
    }
}
