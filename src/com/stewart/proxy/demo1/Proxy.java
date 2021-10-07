package com.stewart.proxy.demo1;

/**
 * @author Stewart
 * @create 2021/10/7
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        //帮房东租房子
        host.rent();
        setHouse();
        hetong();
        fare();
    }

    //看房
    public void setHouse(){
        System.out.println("中介带你看房");
    }
    //收中介费
    public void hetong(){
        System.out.println("签合同");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
