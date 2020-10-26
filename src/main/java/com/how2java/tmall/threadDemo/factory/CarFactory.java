package com.how2java.tmall.threadDemo.factory;

public class CarFactory {
    public static Car createCar(String name){
        if ("".equals(name)){
            return null;
        }
        if (name.equals("宝马")) {
            return new Bmw();
        }
        if (name.equals("奥迪")) {
                return new AoDi();
        }
        return null;
    }
}