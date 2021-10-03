package com.stewart.singleton.type2;

/**
 * @author Stewart
 * @create 2021/9/23
 * 饿汉式(静态代码块)
 */
public class SingtonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //判断两个是否为相同的实例对象
        System.out.println(instance==instance1);
    }
}

class Singleton {

    //1. 构造器私有化，外部不能new
    private Singleton(){

    }

    //2.本类内部创建对象实例，只加载一次
    private  static Singleton instance;

    static { //在静态代码块中，创建对象
        instance = new Singleton();
    }
    //3.提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
