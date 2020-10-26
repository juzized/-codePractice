package com.how2java.tmall.threadDemo.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//这是动态代理类必须要实现InvocationHandler这个接口
public class InvocationHandlerImpl implements InvocationHandler {
    //这其实是业务实现类对象，用来调用具体的方法
    private Object target;

    //构造方法
    public InvocationHandlerImpl(Object target){
        this.target = target;
    }

    //动态代理实际运行的方法

    /**
     *
     * @param proxy 指代理的那个真实的对象
     * @param method 指要调用的真实对象的某个Method对象
     * @param args  指调用某个真实对象方法时接受的参数
     * @return
     * @throws Throwable
     */
    public Object invoke (Object proxy, Method method,Object[] args) throws Throwable{
        System.out.println("调用开始处理");
        //下面的invoke方法是以反射的方式类创建对象的，target指要代理的真实对象，result指动态创建出来的
        //对象，asgs是指构造方法的参数，由第二个参数决定使用哪个构造方法创建对象
        Object result = method.invoke(target,args);
        System.out.println("调用结束处理");
        return result;
    }
}
