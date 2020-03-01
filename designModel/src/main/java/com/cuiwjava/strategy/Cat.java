package com.cuiwjava.strategy;

//对猫进行排序
public class Cat {
    int weight,height;
	/*这里根据猫的体重来进行比较*/
    public Cat(int weight,int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat c){
        if (this.weight < c.weight) return -1;
        else if (this.weight > c.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}