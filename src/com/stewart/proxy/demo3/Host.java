package com.stewart.proxy.demo3;

/**
 * @author Stewart
 * @create 2021/10/7
 * 租房
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
