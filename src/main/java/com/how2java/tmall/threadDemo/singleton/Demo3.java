package com.how2java.tmall.threadDemo.singleton;
//静态内部类方式
//静态内部类的方式，结合了懒汉式和饿汉式加载的优点，加载类是线程安全的
public class Demo3 {

    private Demo3(){
        System.out.println("私有Demo3构造参数初始化");
    }

    public static class SingletonClassInstance{
        private static Demo3 demo3 = new Demo3();
    }

    //方法没有同步
    public static Demo3 getInstance(){
        return SingletonClassInstance.demo3;
    }

    public static void main(String[] args) {
        Demo3 s1 = Demo3.getInstance();
        Demo3 s2 = Demo3.getInstance();
        System.out.println(s1 == s2);
    }
}
