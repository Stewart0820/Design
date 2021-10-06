package com.stewart.factory.simplefactory.tea;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class BiluochunTea implements ITea{
    @Override
    public void makeTea() {
        System.out.println("碧螺春");
    }
}