package com.stewart.singleton.type7;

/**
 * @author Stewart
 * @create 2021/10/3
 * 枚举模式的单例模式，推荐使用
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
    }
}
enum Singleton {
    INSTANCE; //属性
    public void sayOk(){
        System.out.println("ok");
    }
}
