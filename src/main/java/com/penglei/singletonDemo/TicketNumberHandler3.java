package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler3
 * @Description TODO
 * @date 2020-05-08 20:45
 */
public class TicketNumberHandler3 extends TicketNumberHandler{
    //保存单例实例对象
    private static TicketNumberHandler3 INSTANCE;
    //私有化构造方法
    private TicketNumberHandler3() {};

    /**
     * 懒汉式，在第一次获取单例对象的时候初始化对象
     * @return
     */
    public static TicketNumberHandler3 getInstance() {
        if(INSTANCE == null) {
//            try {
//                //这里为什么要让当前线程睡眠1毫秒呢？
//                //因为在正常的业务逻辑中，单利模式的类不可能这么简单，所以实例化时间会多一些
//                //让当前线程睡眠1毫秒
//
//                //这里不应该睡眠1秒，应因为获取单例getInsatnce 本来就这么简单，耗时间的应该是单例执行它的工具方法。
//                //所以所这里不能睡眠1s ， 睡眠1s 会把每种模式耗时间拉平
//                Thread.sleep(1);
//
//
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//            System.out.println("单例3new 前="+INSTANCE);
            INSTANCE = new TicketNumberHandler3();
//            System.out.println("单例3new 后="+INSTANCE);
        }
        return INSTANCE;
    }
}