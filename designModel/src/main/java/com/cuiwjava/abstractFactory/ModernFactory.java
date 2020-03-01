package com.cuiwjava.abstractFactory;

//现代工厂，继承抽象工厂，生产现代族的产品
public class ModernFactory extends AbstracFactory {

    @Override
    Food createFood() {
        return new Bread();
    }
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}