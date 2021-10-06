package com.stewart.prototype.improve;


/**
 * @author Stewart
 * @create 2021/10/6
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("hello", 1, "黑色");
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        //不同的对象，不是同一个对象
        //使用原型模式进行对象的创建，重写clone方法
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }
}
