package com.cuiwjava.singleton;

public class Mgr07 {

    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }
    private static Mgr07 getInstance(){
        return Mgr07Holder.INSTANCE;
    }
    public static void main(String[] args) {
        Mgr07.getInstance();
    }
}
