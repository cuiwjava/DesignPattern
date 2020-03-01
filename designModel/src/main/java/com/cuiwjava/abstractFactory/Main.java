package com.cuiwjava.abstractFactory;

import com.cuiwjava.factoryMethod.*;

public class Main {
    public static void main(String[] args) {
        /*
        现在我们已经定义好了两个产品族，现代族和魔法族。但是每当我想换一个族，都要改很多代码。
        如果我想再添加一个产品族的时候，不需要添加很多代码，也不要修改很多地方。这是要用到抽象工厂。
         */
        Car c = new Car();
        c.go();
        AK47 w = new AK47();
        w.shoot();
        Bread b = new Bread();
        b.printName();

        Broom b1 = new Broom();
        b1.go();
        MagicStick ma = new MagicStick();
        ma.shoot();
        MushRoom r = new MushRoom();
        r.printName();

        AbstracFactory f = new ModernFactory();

        Vehicle vehicle = f.createVehicle();
        vehicle.go();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
        Food food = f.createFood();
        food.printName();
        /*
        抽象工厂的结构是：
        抽象工厂（AbstracFactory）可以生产Vehicle、Weapon、Food这三个抽象的东西。
        具体工厂 继承抽象工厂（AbstracFactory），具体工厂生产具体的东西，汽车、AK47等，这些东西都是从抽象工厂生产的抽象的东西继承。
         */
    }
}