package com.how2java.tmall.threadDemo.singleton;
//懒汉式
public class Demo2 {
    //类初始化时，不会立即加载该对象，真正需要使用的时候才会创建该对象，具备懒加载功能
    //懒汉式单例要注意线程安全带问题
    private static Demo2 demo2;

    private Demo2(){
        System.out.println("私有的demo2的构造参数初始化");
    }

    //懒汉式单例模式时要注意线程安全问题
    public synchronized static Demo2 getInstance(){
        if(demo2 == null){
            demo2 = new Demo2();
        }
        return demo2;
    }

    public static void main(String[] args) {
        Demo2 s1 = Demo2.getInstance();
        Demo2 s2 = Demo2.getInstance();
        System.out.println(s1 == s2);
    }
}
