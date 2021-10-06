package com.stewart.factory.abstractfactory.factory;

import com.stewart.factory.abstractfactory.IFridge;
import com.stewart.factory.abstractfactory.IWasher;
import com.stewart.factory.abstractfactory.geli.GeliFridge;
import com.stewart.factory.abstractfactory.geli.GeliWasher;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class GeliHouseholdFactory implements IHouseholdElectricFactory{
    @Override
    public IFridge createFridge() {
        return new GeliFridge();
    }

    @Override
    public IWasher createWasher() {
        return new GeliWasher();
    }
}
