package com.stewart.proxy.demo2;

/**
 * @author Stewart
 * @create 2021/10/7
 * 代理模式，在不改变原有代码的时候，添加代码，接口
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserServiceImpl(userService);
        userServiceProxy.add();
    }
}
