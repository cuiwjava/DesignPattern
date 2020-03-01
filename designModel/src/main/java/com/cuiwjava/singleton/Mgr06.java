package com.cuiwjava.singleton;

public class Mgr06 {
    private static Mgr06 INSTANCE;

    private static Mgr06 getInstance(){

        if (INSTANCE == null) {
            synchronized (Mgr06.class){
                if (INSTANCE == null) {
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr06.getInstance();
    }
}
