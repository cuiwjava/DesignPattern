package com.cuiwjava.factoryMethod;

public class CarFactory {
    public Car create() {
        System.out.println("a car created!");
        return new Car();
    }
}