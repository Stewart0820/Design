package com.stewart.singleton.type6;

/**
 * @author Stewart
 * @create 2021/9/23
 * 使用静态内部类 推荐使用！！！！！！
 */
public class SingtonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
    }
}

// 静态内部类完成的
class Singleton {
    private static volatile Singleton instance;

    //构造器私有化
    private Singleton(){}

    //写一个静态内部类，该类中有一个静态属性
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
