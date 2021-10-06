package com.stewart.factory.abstractfactory.factory;

import com.stewart.factory.abstractfactory.IFridge;
import com.stewart.factory.abstractfactory.IWasher;
import com.stewart.factory.abstractfactory.meide.MeideFridge;
import com.stewart.factory.abstractfactory.meide.MeideWasher;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class MeideHouseholdFactory  implements IHouseholdElectricFactory{
    @Override
    public IFridge createFridge() {
        return new MeideFridge();
    }

    @Override
    public IWasher createWasher() {
        return new MeideWasher();
    }
}
