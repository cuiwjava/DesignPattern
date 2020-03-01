package com.cuiwjava.singleton;

public class Mgr03 {
    private static Mgr03 INSTANCE;

    private static Mgr03 getInstance(){

        if (INSTANCE == null) {
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr03.getInstance();
    }
}
