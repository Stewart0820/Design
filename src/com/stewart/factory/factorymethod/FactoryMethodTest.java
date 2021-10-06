package com.stewart.factory.factorymethod;

/**
 * @author Stewart
 * @create 2021/10/6
 * 工厂方法也有缺点：
 * 1、类的个数容易过多，增加复杂度。
 * 2、增加了系统的抽象性和理解难度。
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ITeaFactory factory = new LongjingTeaFactory();
        factory.createTea();

        factory = new BiluochunTeaFactory();
        factory.createTea();
    }
}
