package com.penglei.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName DynamicProxy
 * @Description 创建动态代理类
 * @date 2020-04-27 15:26
 */
// 创建动态代理类需要实现 InvocationHandler 接口
public class DynamicProxy implements InvocationHandler {

    // 被代理对象
    private Object target;


    //绑定被代理对象，并返回代理对象。
    public Object bind(Object target) {
        this.target = target;
        //{newProxyInstance,第一个参数：被代理类的类加载器，第二个参数：被代理类的实现接口，第三个参数：代理对象}
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }

    // 重写 invoke 方法{proxy 被代理类对象，
    /**
     * @Author ascetic
     * @Description 动态代理 invoke 方法
     * @Date 15:41 2020-04-27
     * @Param [proxy 被代理对象, method 被调用方法, args 方法参数]
     * @return java.lang.Object
     **/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=============我是JDK动态代理================");
        Object result = null;
        //代理方法前调用
        System.out.println("女朋友出门前小鹏带钥匙");

        //执行方法，相当于执行女朋友出门吃饭的方法
        result = method.invoke(target,args);

        //代理方法后调用
        System.out.println("女朋友吃饭后小鹏付钱");

        return result;
    }
}
