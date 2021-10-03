package com.stewart.singleton.type4;

/**
 * @author Stewart
 * @create 2021/9/23
 * 懒汉式  线程安全,效率太低了
 */
public class SingtonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton(){}

    //加入了同步处理的代码块，解决线程安全问题
    //每一次获取实例，都需要同步，效率太低了
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
