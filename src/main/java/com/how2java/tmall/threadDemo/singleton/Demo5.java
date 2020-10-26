package com.how2java.tmall.threadDemo.singleton;
//双重检测锁的方式（因为jvm重排序的原因，可能会被初始化多次，不推荐使用）
public class Demo5 {
    private static Demo5 demo5;

    private Demo5(){
        System.out.println("demo5的私有构造方法");
    }

    public static Demo5 getInstance(){
        if (demo5 == null){
            synchronized(Demo5.class){
                if (demo5 == null){
                   demo5 = new Demo5();
                }
            }
        }
        return demo5;
    }

    public static void main(String[] args) {
        Demo5 s1 = Demo5.getInstance();
        Demo5 s2 = Demo5.getInstance();
        System.out.println(s1 == s2);
    }
}
