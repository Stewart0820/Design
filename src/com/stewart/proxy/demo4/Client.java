package com.stewart.proxy.demo4;

import com.stewart.proxy.demo2.UserService;
import com.stewart.proxy.demo2.UserServiceImpl;

/**
 * @author Stewart
 * @create 2021/10/7
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService= new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置要代理的对象
        pih.setTarget(userService);

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
