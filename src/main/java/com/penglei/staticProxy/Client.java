package com.penglei.staticProxy;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description 客户端
 * @date 2020-04-27 15:16
 */
public class Client {

    public static void main(String[] args) {
        // new RealSubject() 女朋友对象
        // new ProxySubject(new RealSubject()) 代理女朋友对象
        ProxySubject subject = new ProxySubject(new RealSubject());
        // subject.visit() 代理对象执行 "出门吃饭" 方法
        subject.visit();
    }
}
