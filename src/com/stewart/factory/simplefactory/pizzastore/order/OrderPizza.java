package com.stewart.factory.simplefactory.pizzastore.order;

import com.stewart.factory.simplefactory.pizzastore.pizza.ChesePizze;
import com.stewart.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.stewart.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Stewart
 * @create 2021/10/3
 */
public class OrderPizza {
    public  OrderPizza(){
        Pizza pizza = null;
        String orderType; //披萨类型
        do{
            orderType = gettype();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if(orderType.equals("cheese")){
                pizza = new ChesePizze();
                pizza.setName("奶酪披萨");
            } else{
                break;
            }
            pizza.prepare();
            pizza.back();
            pizza.cut();
            pizza.box();
        }while(true);
    }
    private String gettype(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
