package com.how2java.tmall.threadDemo.factory;

public class BmwFactory implements Factory {
    public Car createCar(){
        return new Bmw();
    }
}
