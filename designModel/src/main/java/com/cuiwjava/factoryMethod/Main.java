package com.cuiwjava.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Moveable m = new Plane();
        m.go();
        // 以上小程序中，plane、car、broom都实现了Moveable接口，当我想换一种工具，只要换一个对象就好了，不需要重新new对象了。

    }
}