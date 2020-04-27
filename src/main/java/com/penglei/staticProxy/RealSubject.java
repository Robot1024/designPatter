package com.penglei.staticProxy;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName RealSubject
 * @Description 被代理对象
 * @date 2020-04-27 15:14
 */
public class RealSubject implements Subject {

    private String name = "女朋友出门去吃饭";
    @Override
    public void visit() {
        System.out.println(name);
    }
}