package com.example.designpattern.singletonpattern;

public class DbSingleton {


    /**
     * Singleton pattern is used to load a class once
     * mainly used with a static instance of the class
     * Creational design pattern : Eg :- Spring beans , logger, runtime
     * instance variable is a private
     */
    private static DbSingleton instance = null;


    /**
     * Lazy loading be checking for null
     */
    public static DbSingleton getInstance() {
        if (instance==null){

            synchronized (DbSingleton.class){
                if(instance==null)
                    instance= new DbSingleton();
            }
        }

        return instance;
    }

    /**
     * private so that no other class can use the constructor
     */
    private DbSingleton(){

    }
}
