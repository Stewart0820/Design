package com.stewart.factory.simplefactory.pizzastore.pizza;

/**
 * @author Stewart
 * @create 2021/10/3
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备彩礼");
    }
}
