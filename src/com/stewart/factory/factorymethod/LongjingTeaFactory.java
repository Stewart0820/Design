package com.stewart.factory.factorymethod;

import com.stewart.factory.simplefactory.tea.ITea;
import com.stewart.factory.simplefactory.tea.LongjingTea;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class LongjingTeaFactory implements ITeaFactory{
    @Override
    public ITea createTea() {
        return new LongjingTea();
    }
}
