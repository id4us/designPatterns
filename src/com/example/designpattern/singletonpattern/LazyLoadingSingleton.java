package com.example.designpattern.singletonpattern;

public class LazyLoadingSingleton {


    /**
     * Singleton pattern is used to load a class once
     * mainly used with a static instance of the class
     * Creational design pattern : Eg :- Spring beans , logger, runtime
     * instance variable is a private
     */
    private static LazyLoadingSingleton instance = null;


    /**
     * Lazy loading be checking for null
     */
    public static LazyLoadingSingleton getInstance() {
        if (instance==null){

            synchronized (LazyLoadingSingleton.class){
                if(instance==null)
                    instance= new LazyLoadingSingleton();
            }
        }

        return instance;
    }

    /**
     * private so that no other class can use the constructor
     */
    private LazyLoadingSingleton(){

    }
}
