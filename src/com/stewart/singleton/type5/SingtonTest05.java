package com.stewart.singleton.type5;

/**
 * @author Stewart
 * @create 2021/9/23
 * 双重检查 推荐使用！！！！！！
 */
public class SingtonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
    }
}

class Singleton {
    private static volatile Singleton instance;

    private Singleton(){}

    //加入了双重检查，解决线程安全问题,同时解决懒加载问题
    //同时保证效率
    public static synchronized Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
