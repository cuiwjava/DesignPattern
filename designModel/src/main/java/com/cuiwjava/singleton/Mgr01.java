package com.cuiwjava.singleton;

public class Mgr01 {
    private final static Mgr01 INSTANCE = new Mgr01();

    private Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = new Mgr01();
        mgr01.getInstance();

    }

}
