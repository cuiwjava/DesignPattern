package com.cuiwjava.factoryMethod;

//现代工厂，继承抽象工厂，生产现代族的产品
public class ModernFactory {
	@Override
    Food createFood() {
        return new Bread();
    }
    @Override
    Food createVehicle() {
        return new Car();
    }
    @Override
    Food createWeapon() {
        return new AK47();
    }
}