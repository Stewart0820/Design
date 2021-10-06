package com.stewart.factory.factorymethod;

import com.stewart.factory.simplefactory.tea.ITea;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public interface ITeaFactory {

    // 生产茶叶
    public ITea createTea();
}
