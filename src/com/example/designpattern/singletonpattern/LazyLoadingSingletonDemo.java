package com.example.designpattern.singletonpattern;

public class LazyLoadingSingletonDemo {

    public static void main(String[] args) {
        LazyLoadingSingleton lazyLoadingSingleton = LazyLoadingSingleton.getInstance();

        System.out.println("first instance: "+"\n"+ lazyLoadingSingleton);

        LazyLoadingSingleton anotherS = LazyLoadingSingleton.getInstance();
        System.out.println("second instance: "+"\n"+anotherS);

    }

}
