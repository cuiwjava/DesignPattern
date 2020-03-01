package com.cuiwjava.singleton;

public class Mgr04 {
    private static Mgr04 INSTANCE;

    private static synchronized Mgr04 getInstance(){

        if (INSTANCE == null) {
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr04.getInstance();
    }
}
