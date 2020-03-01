package com.cuiwjava.singleton;

/**
 * 没有构造方法 无法构造对象 无法反序列化对象 返回的是单例创建的同一个对象
 */
public enum Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        Mgr08.INSTANCE.hashCode();
    }
}
