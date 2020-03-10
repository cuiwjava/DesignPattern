package com.cuiwjava.singleton;

public class Mgr05 {
    private static Mgr05 INSTANCE;

    private static Mgr05 getInstance(){

        if (INSTANCE == null) {
            synchronized (Mgr05.class){
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr05.getInstance();
    }
}
