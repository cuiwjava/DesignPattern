package com.cuiwjava.abstractFactory;

//抽象工厂
public abstract class AbstracFactory {
    //这个抽象的工厂，会生产3个抽象的产品
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}