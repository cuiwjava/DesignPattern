package com.cuiwjava.factoryMethod;

//交通工具工厂
public class SimpleVehicleFactory {
    public Car createCar() {
        //before processing 前置处理
        return new Car();
    }
    public Broom createBroom() {
        //before processing 前置处理
        return new Broom();
    }
    public Plane createPlane() {
        //before processing 前置处理
        return new Plane();
    }
    // 简单工厂的可扩展性不好，每当我们添加一种交通工具，都要重新写一个方法，方法里面的东西都要重写。
}