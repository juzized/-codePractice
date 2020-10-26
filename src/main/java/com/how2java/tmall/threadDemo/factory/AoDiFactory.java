package com.how2java.tmall.threadDemo.factory;

public class AoDiFactory implements Factory {
    public Car createCar(){
        return new AoDi();
    }
}
