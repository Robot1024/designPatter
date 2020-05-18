package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler2
 * @Description TODO
 * @date 2020-05-18 17:10
 */public class TicketNumberHandler2 extends TicketNumberHandler {
    // 饿汉式
    private static TicketNumberHandler2 INSTANCE;

    //使用静态代码块，初始化对象
    static {
        INSTANCE = new TicketNumberHandler2();
    }
    //私有化构造方法
    private TicketNumberHandler2() {};
    /**
     * 获取单例实例
     * @return
     */
    public static TicketNumberHandler2 getInstance() {
        return INSTANCE;
    }
}