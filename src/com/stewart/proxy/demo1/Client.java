package com.stewart.proxy.demo1;

/**
 * @author Stewart
 * @create 2021/10/7
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
