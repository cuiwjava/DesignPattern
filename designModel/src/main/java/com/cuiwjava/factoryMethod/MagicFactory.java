package com.cuiwjava.factoryMethod;

//魔法工厂，继承抽象工厂，生产魔法族的产品
/*
抽象工厂的结构是：
抽象工厂（AbstracFactory）可以生产Vehicle、Weapon、Food这三个抽象的东西。
具体工厂 继承抽象工厂（AbstracFactory），具体工厂生产具体的东西，汽车、AK47等，这些东西都是从抽象工厂生产的抽象的东西继承。
 */
public class MagicFactory {
	@Override
    Food createFood() {return new MushRoom(); }
    @Override
    Food createVehicle() {return new Broom(); }
    @Override
    Food createWeapon() {return new MagicStick(); }
}