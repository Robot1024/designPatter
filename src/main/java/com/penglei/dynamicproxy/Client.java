package com.penglei.dynamicproxy;

import javax.swing.*;
import java.lang.reflect.Proxy;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description 客户端
 * @date 2020-04-27 15:28
 */
public class Client {

    public static void main(String[] args) {


        // 代理类
        DynamicProxy proxy = new DynamicProxy();
        // 被代理列
        RealSubject realSubject = new RealSubject();
        // 代理类绑定被代理类
        Subject subject = (Subject) proxy.bind(realSubject);

        // 返回的被代理对象不是 RealSubject 子类，它是被代理对象子类，所以不能强转成成被代理类，java动态代理是是基于接口的，所以可以转成接口对象
        // 代理类执行方法先执行 invoke 方法，invoke 方法再执行 method.invoke(target,args); 相当于执行被代理类的方法

        //这是错误写法
        //RealSubject subject = (RealSubject) proxy.bind(realSubject);

        // 代理类执行 代理方法
        subject.visit();

    }
}
