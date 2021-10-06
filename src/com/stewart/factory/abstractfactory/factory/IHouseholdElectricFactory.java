package com.stewart.factory.abstractfactory.factory;

import com.stewart.factory.abstractfactory.IFridge;
import com.stewart.factory.abstractfactory.IWasher;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public interface  IHouseholdElectricFactory {
    IFridge createFridge();

    IWasher createWasher();
}
