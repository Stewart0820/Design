package com.stewart.factory.abstractfactory.meide;

import com.stewart.factory.abstractfactory.IFridge;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class MeideFridge  implements IFridge {
    @Override
    public void coldStorage() {
        System.out.println("美的冰箱");
    }
}
