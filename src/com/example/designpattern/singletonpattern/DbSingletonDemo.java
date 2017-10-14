package com.example.designpattern.singletonpattern;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();

        System.out.println(dbSingleton);

        DbSingleton anotherS = DbSingleton.getInstance();
        System.out.println(anotherS);

    }

}
