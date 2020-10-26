package com.how2java.tmall.threadDemo.singleton;
//饿汉式
public class Demo1 {
    //类初始化时，会立即加载对象，线程安全，调用效率高
    private static Demo1 demo1 = new Demo1();

    private Demo1(){
        System.out.println("私有的demo1构造参数初始化");
    }
    public static Demo1 getInstance(){
        return demo1;
    }

    public static void main(String[] args) {
        Demo1 s1 = Demo1.getInstance();
        Demo1 s2 = Demo1.getInstance();
        System.out.println(s1 == s2);
    }
}
