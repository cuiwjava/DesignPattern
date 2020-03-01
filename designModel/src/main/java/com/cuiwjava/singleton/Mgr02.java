package com.cuiwjava.singleton;

public class Mgr02 {
    private  final static Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }

    private static Mgr02 getInstance(){
        return INSTANCE;
    }
    public static void main(String[] args) {
        Mgr02.getInstance();
    }
}
