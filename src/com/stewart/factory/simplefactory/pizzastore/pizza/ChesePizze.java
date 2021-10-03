package com.stewart.factory.simplefactory.pizzastore.pizza;

/**
 * @author Stewart
 * @create 2021/10/3
 */
public class ChesePizze extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给执着奶酪披萨准备材料");
    }
}
