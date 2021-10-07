package com.stewart.builder;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高级房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高级房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高级房子屋顶");
    }

}
