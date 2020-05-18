package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler4
 * @Description TODO
 * @date 2020-05-18 17:12
 */
public class TicketNumberHandler4 extends TicketNumberHandler {
    //保存单例实例对象
    private static TicketNumberHandler4 INSTANCE;
    //私有化构造方法
    private TicketNumberHandler4() {};

    /**
     * 懒汉式，在第一次获取单例对象的时候初始化对象
     * @return
     */
    public synchronized static TicketNumberHandler4 getInstance() {
        if(INSTANCE == null) {

            INSTANCE = new TicketNumberHandler4();
        }
        return INSTANCE;
    }
}