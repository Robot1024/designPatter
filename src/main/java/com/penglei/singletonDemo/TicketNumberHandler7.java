package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler7
 * @Description TODO
 * @date 2020-05-18 17:25
 */
public class TicketNumberHandler7 extends TicketNumberHandler {
    //私有化构造器
    public TicketNumberHandler7() {};

    //静态内部类
    private static class TicketNumberHandler7Instance{
        private static final TicketNumberHandler7 INSTANCE = new TicketNumberHandler7();
    }

    public static TicketNumberHandler7 getInstance() {
        return TicketNumberHandler7Instance.INSTANCE;
    }
}