package com.cuiwjava.strategy;

/*对狗进行排序*/
public class Dog implements Comparable <Dog>{ //指定Dog类型

    int food;//根据饭量
    //带参构造方法
    public  Dog(int food){
        this.food=food;

    }

    @Override
    public int compareTo(Dog d) {
//        Dog d= (Dog)o;   这时我们就不需要进行类型转换
        if (this.food < d.food) return -1;
        else if(this.food > d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
