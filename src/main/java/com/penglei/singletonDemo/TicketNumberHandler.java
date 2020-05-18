package com.penglei.singletonDemo;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName TicketNumberHandler
 * @Description TODO
 * @date 2020-05-08 20:45
 */
public class TicketNumberHandler {
    //记录下一个唯一的号码
    private AtomicLong nextUniqueNumber = new AtomicLong(1);
    /**
     * 返回生成的号码
     * @return
     */
    public Long getTicketNumber() {

        return nextUniqueNumber.incrementAndGet();

    }
}