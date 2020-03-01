package com.cuiwjava.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int[] a ={9,2,3,5,7,1,4};
        //Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
/*
           Dog[] a = {new Dog(1),new Dog(4),new Dog(3)};
           Sorter sorter = new Sorter();
           sorter.sort(a);
           System.out.println(Arrays.toString(a));
*/
        //int[] a ={9,2,3,5,7,1,4};
        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        // Dog[] a = {new Dog(1),new Dog(4),new Dog(3)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a,new CatComparator()); //我们需要new一个CatComparator传入Sort()方法中
        System.out.println(Arrays.toString(a));
    }
}