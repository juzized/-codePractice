package com.how2java.tmall.threadDemo.factory;

public class Client01 {
    public static void main(String[] args) {
        Car audi = new AoDiFactory().createCar();
        Car bmw = new BmwFactory().createCar();
        audi.run();
        bmw.run();
    }
}
