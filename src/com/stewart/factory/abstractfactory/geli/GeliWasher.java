package com.stewart.factory.abstractfactory.geli;

import com.stewart.factory.abstractfactory.IWasher;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class GeliWasher implements IWasher {
    @Override
    public void wash() {
        System.out.println("格力洗衣机");
    }
}
