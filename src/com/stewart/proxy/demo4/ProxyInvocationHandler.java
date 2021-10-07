package com.stewart.proxy.demo4;

import com.stewart.proxy.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Stewart
 * @create 2021/10/7
 * 动态代理的好处
 * 工具类，可以直接使用
 * 一个动态代理类代理是一个接口，就是一类业务
 * 一个动态代理类可以代理多个类，只要是实现了同一个接口即可
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return  Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //通过反射，获取方法名
        log(method.getName());
        //动态代理的本质，就是使用反射机制
        Object result = method.invoke(target, args);
        return result;
    }

    //在每个方法添加log
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}

