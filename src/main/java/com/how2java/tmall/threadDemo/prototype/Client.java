package com.how2java.tmall.threadDemo.prototype;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setPassword("123456");
        ArrayList<String> pones = new ArrayList<>();
        pones.add("15911216604");
        user.setPhones(pones);

        //copy一个User对象
        User user1 = user.clone();
        user1.setName("李四");

        //查看两个对象是否是一个
        System.out.println(user == user1);

        //查看属性内容
        System.out.println("user"+user.getName() + "---" + "user1" + user1.getName());
        System.out.println("user"+user.getPassword() + "---" + "user1" + user1.getPassword());

        //查看对于引用类型的拷贝
        System.out.println(user.getPhones() == user1.getPhones());
    }
}
