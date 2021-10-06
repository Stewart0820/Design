package com.stewart.prototype;

/**
 * @author Stewart
 * @create 2021/10/6
 * 克隆羊问题
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("hello", 1, "黑色");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
