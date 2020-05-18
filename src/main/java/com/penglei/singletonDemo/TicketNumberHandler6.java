package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler6
 * @Description TODO
 * @date 2020-05-18 17:23
 */
public class TicketNumberHandler6 extends TicketNumberHandler {
    //保存单例实例对象
    private static TicketNumberHandler6 INSTANCE;
    //私有化构造方法
    private TicketNumberHandler6() {};

    /**
     * 懒汉式，在第一次获取单例对象的时候初始化对象
     * @return
     */
    public static TicketNumberHandler6 getInstance() {
        //双重检查
        if(INSTANCE == null) {
            synchronized (TicketNumberHandler5.class) {
                try {
                    //这里为什么要让当前线程睡眠1毫秒呢？
                    //因为在正常的业务逻辑中，单利模式的类不可能这么简单，所以实例化时间会多一些
                    //让当前线程睡眠1毫秒
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if(INSTANCE == null) {
                    INSTANCE = new TicketNumberHandler6();
                }
            }
        }
        return INSTANCE;
    }
}