package com.how2java.tmall.threadDemo.proxy;
//添加完静态代理的测试类
public class Test {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
