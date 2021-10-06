package com.stewart.factory.simplefactory.pizzastore.order;

import com.stewart.factory.simplefactory.pizzastore.pizza.ChesePizze;
import com.stewart.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.stewart.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author Stewart
 * @create 2021/10/5
 */
public class SimpleFactory {


    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");

        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new ChesePizze();
            pizza.setName("奶酪披萨");
        }

        return pizza;
    }
}
