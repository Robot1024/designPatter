package com.penglei.singletonDemo;

import java.util.concurrent.CountDownLatch;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TestIdeaMainThread
 * @Description TODO
 * @date 2020-05-16 18:13
 */
public class TestIdeaMainThread {

    /**
     * @Author ascetic
     * @Description TODO
     * @Date 18:14 2020-05-16
     * @Param [args]
     * @return void
     *
     * 测试main线程数，使用idea run 执行会是2个线程，一个主线程，一个Monitor 监控线程
     * 测试main线程数，使用idea debug 执行会是1个线程, 没有监控线程
     **/
    public static void main(String[] args) {

        while (Thread.activeCount() > 1) {
            System.out.println(Thread.activeCount());
        }
        System.out.println(Thread.activeCount());
    }
}