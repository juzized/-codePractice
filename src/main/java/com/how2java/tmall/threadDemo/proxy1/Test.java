package com.how2java.tmall.threadDemo.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
//动态代理的测试类
public class Test {
    public static void main(String[] args) {
        //被代理的对象
        UserDao userDaoImpl = new UserDaoImpl();
        InvocationHandler invocationHandlerImpl = new InvocationHandlerImpl(userDaoImpl);

        //类加载器
        ClassLoader classLoader = userDaoImpl.getClass().getClassLoader();
        //被代理对象实现的接口
        Class<?>[] interfaces = userDaoImpl.getClass().getInterfaces();

        //代理对象
        UserDao userDaoProxyInstance = (UserDao) Proxy.newProxyInstance(classLoader,interfaces,invocationHandlerImpl);
        userDaoProxyInstance.save();
    }
}
