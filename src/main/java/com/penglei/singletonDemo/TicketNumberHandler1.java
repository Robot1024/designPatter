package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler1
 * @Description TODO
 * @date 2020-05-18 17:05
 */
public class TicketNumberHandler1 extends TicketNumberHandler{
    // 饿汉式，在类加载的时候初始化对象
    private static TicketNumberHandler1 INSTANCE = new TicketNumberHandler1();
    //私有化构造方法
    private TicketNumberHandler1() {};
    /**
     * 获取单例实例
     * @return
     */
    public static TicketNumberHandler1 getInstance() {
        return INSTANCE;
    }
}