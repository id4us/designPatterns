package com.example.designpattern.singletonpattern;


public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton() {
        System.out.println("This is the object");
    }

    public static void main(String[] args) {
        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(EnumSingleton.INSTANCE);
        System.out.println(EnumSingleton.INSTANCE);
    }
}


