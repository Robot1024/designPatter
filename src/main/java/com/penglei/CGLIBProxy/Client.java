package com.penglei.CGLIBProxy;

import com.penglei.dynamicproxy.DynamicProxy;
import com.penglei.dynamicproxy.RealSubject;
import com.penglei.dynamicproxy.Subject;

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
        CGLIBProxy proxy = new CGLIBProxy();
        // 被代理列
        RealSubject realSubject = new RealSubject();

        // 获取代理对象
        Subject subject = (Subject) proxy.getProxySubject(realSubject);
        // 代理类执行 代理方法
        subject.visit();






    }
}
