package com.stewart.factory.factorymethod;

import com.stewart.factory.simplefactory.tea.BiluochunTea;
import com.stewart.factory.simplefactory.tea.ITea;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class BiluochunTeaFactory implements ITeaFactory{
    @Override
    public ITea createTea() {
        return new BiluochunTea();
    }
}