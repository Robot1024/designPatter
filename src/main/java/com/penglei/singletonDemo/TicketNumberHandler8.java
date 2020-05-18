package com.penglei.singletonDemo;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler8
 * @Description TODO
 * @date 2020-05-18 17:28
 */public enum TicketNumberHandler8 {
    INSTANCE;
    private AtomicLong nextUniqueNumber = new AtomicLong();
    //记录下一个唯一的号码
//    private long nextUniqueNumber = 1;
    /**
     * 返回生成的号码
     * @return
     */
    public synchronized Long getTicketNumber() {
//        return nextUniqueNumber++;
        return nextUniqueNumber.incrementAndGet();
    }
}

