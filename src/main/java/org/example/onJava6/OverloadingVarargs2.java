package org.example.onJava6;

public class OverloadingVarargs2 {
    public static void main(String[] args) {
        f('a','c');
        f(0.1F, 'f');
        // 报错信息 java: 对f的引用不明确
        //  org.example.onJava6.OverloadingVarargs2 中的方法 f(float,java.lang.Character...) 和 org.example.onJava6.OverloadingVarargs2 中的方法 f(java.lang.Character...) 都匹配
    }
    static void f(float i, Character... c) {
        System.out.println("first");
    }
    static void f(char a,Character... c) {
        System.out.println("second");
    }
}
