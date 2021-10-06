package com.stewart.factory.simplefactory.tea;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class text {
    public static void main(String[] args) {

        TeaFactory teaFactory = new TeaFactory();
        ITea tea = teaFactory.createTea("longjing");
    }

}
