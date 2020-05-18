package com.penglei.state1;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020-05-12 18:18
 */
public class Client {

    public static void main(String[] args) {
        //创建环境对象
        Context context = new Context();
        //初始化状态
        context.setCurrentSate(new ConcreteStateA(context));
        //执行动作
        context.handle1();
        context.handle2();
    }
}