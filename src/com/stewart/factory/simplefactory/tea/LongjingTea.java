package com.stewart.factory.simplefactory.tea;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class LongjingTea implements ITea {
    @Override
    public void makeTea() {
        System.out.println("西湖龙井");
    }
}


