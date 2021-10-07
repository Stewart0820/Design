package com.stewart.proxy.demo2;

/**
 * @author Stewart
 * @create 2021/10/7
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userServiceImpl;

    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    @Override
    public void delete() {
        log("add");
        userServiceImpl.delete();
    }

    @Override
    public void update() {
        log("update");
        userServiceImpl.update();
    }

    @Override
    public void query() {
        log("query");
        userServiceImpl.query();
    }
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
