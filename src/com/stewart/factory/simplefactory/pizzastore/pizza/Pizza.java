package com.stewart.factory.simplefactory.pizzastore.pizza;

/**
 * @author Stewart
 * @create 2021/10/3
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void back(){
        System.out.println(name+"baking");
    }

    public void cut(){
        System.out.println(name+"cutting");
    }

    public void box(){
        System.out.println(name+"boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}
