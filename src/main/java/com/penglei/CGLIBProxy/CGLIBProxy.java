package com.penglei.CGLIBProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName CGLIBProxy
 * @Description CGLIB 动态代理实现类
 * @date 2020-04-27 16:07
 */
public class CGLIBProxy implements MethodInterceptor {


    // 被代理对象
    private Object target;


    public Object getProxySubject(Object target){

        this.target = target;

        // Enhancer是cglib中使用频率很高的一个类，它是一个字节码增强器，可以用来为无接口的类创建代理。
        // 它的功能与java自带的Proxy类挺相似的。它会根据某个给定的类创建子类，并且所有非final的方法都带有回调钩子。
        // JDK 动态代理的被代理对象和代理对象是  兄弟级别
        // CGLIB 动态代理的被代理对象和代理对象是  父子级别
        Enhancer enhancer = new Enhancer();
        // 把被代理对象设置成父类
        enhancer.setSuperclass(this.target.getClass());
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }



    //参数：Object为由CGLib动态生成的代理类实例，Method为上文中实体类所调用的被代理的方法引用，Object[]为参数值列表，MethodProxy为生成的代理类对方法的代理引用。
    //返回：从代理实例的方法调用返回的值。
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("=============我是CGLIB动态代理===============");
        Object result = null;
        //代理方法前调用
        System.out.println("女朋友出门前小鹏带钥匙");


        //这其中MethodProxy proxy参数一般是用来调用原来的对应方法的。比如可以proxy.invokeSuper(obj, args)。
        //那么为什么不能像InvocationHandler那样用method来调用呢？
        //因为如果用method调用会再次进入拦截器。为了避免这种情况，应该使用接口方法中第四个参数methodProxy调用invokeSuper方法。

        //执行方法，相当于执行女朋友出门吃饭的方法
        result = methodProxy.invokeSuper(obj,args);

        //代理方法后调用
        System.out.println("女朋友吃饭后小鹏付钱");


        return result;
    }
}
