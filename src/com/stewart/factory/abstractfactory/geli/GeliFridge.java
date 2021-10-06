package com.stewart.factory.abstractfactory.geli;

import com.stewart.factory.abstractfactory.IFridge;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class GeliFridge implements IFridge {
    @Override
    public void coldStorage() {
        System.out.println("格力冰箱");
    }
}

