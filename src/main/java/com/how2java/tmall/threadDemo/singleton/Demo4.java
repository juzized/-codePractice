package com.how2java.tmall.threadDemo.singleton;
//使用枚举实现单例模式
//优点:实现简单，枚举本身就是单列，由jvm从根本上提供保证，避免通过放射和序列化的漏洞
//缺点：没有延迟加载
public class Demo4 {
    public static Demo4 getInstance(){
        return Demo.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        Demo4 s1 = Demo4.getInstance();
        Demo4 s2 = Demo4.getInstance();
        System.out.println(s1 == s2);
    }

    //定义枚举
    private static enum Demo{
        INSTANCE;
        //枚举元素为单列
        private  Demo4 demo4;

        private Demo(){
            System.out.println("私有的Demo构造方法");
            demo4 = new Demo4();
        }

        public Demo4 getInstance(){
            return demo4;
        }
    }
}
