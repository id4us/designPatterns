package com.example.designpattern.singletonpattern;

public class DbSingleton {

    public static DbSingleton instance = null;

    public static DbSingleton getInstance() {
        if (instance==null){
            instance= new DbSingleton();
        }

        return instance;
    }
    private DbSingleton(){

    }
}
