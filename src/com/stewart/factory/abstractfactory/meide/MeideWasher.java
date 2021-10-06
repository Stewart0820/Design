package com.stewart.factory.abstractfactory.meide;

import com.stewart.factory.abstractfactory.IWasher;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class MeideWasher implements IWasher {
    @Override
    public void wash() {
        System.out.println("美的洗衣机");
    }
}
