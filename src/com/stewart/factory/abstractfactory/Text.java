package com.stewart.factory.abstractfactory;

import com.stewart.factory.abstractfactory.factory.IHouseholdElectricFactory;
import com.stewart.factory.abstractfactory.factory.MeideHouseholdFactory;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class Text {
    public static void main(String[] args) {

        IHouseholdElectricFactory factory = new MeideHouseholdFactory();
        factory.createFridge().coldStorage();
        factory.createWasher().wash();
    }
}
