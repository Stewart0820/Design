package com.stewart.factory.simplefactory.tea;

/**
 * @author Stewart
 * @create 2021/10/6
 */
public class TeaFactory {
    public ITea createTea(String type){
        ITea tea = null;
        if(type.equals("longjing")){
            tea = new LongjingTea();
        }else if(type.equals("biluochun")){
            tea = new BiluochunTea();
        }
        if(tea != null){
            tea.makeTea();
        }
        return tea;
    }
}
