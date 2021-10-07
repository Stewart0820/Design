package com.stewart.proxy.demo3;

/**
 * @author Stewart
 * @create 2021/10/7
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);
        //动态生成的
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
