package com.how2java.tmall.threadDemo;

public class TestDemo {
    public static void main(String[] args) {
        RunnableDemo thread1 = new RunnableDemo("thread-1");
        thread1.start();

        RunnableDemo thread2 = new RunnableDemo("thread-2");
        thread2.start();
    }
}
