package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName BuyTicket
 * @Description TODO
 * @date 2020-05-08 20:46
 */
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BuyTicket1 {

    public static void main(String[] args) {


        // 用户人数
        int userNumber = 10000;

        ExecutorService service = Executors.newFixedThreadPool(userNumber);

        final CountDownLatch latch = new CountDownLatch(userNumber);



        // 用于存放TicketNumberHandler实例对象
        List<TicketNumberHandler> hanlderList = new Vector();
//        List<TicketNumberHandler> hanlderList = new ArrayList<>();
        // 保存生成的票号
        List<Long> ticketNumberList = new Vector();
//        List<Long> ticketNumberList = new ArrayList<>();


        //记录购票开始时间
        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < userNumber; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    TicketNumberHandler handler = TicketNumberHandler3.getInstance();

                    hanlderList.add(handler);

                    Long ticketNumber = handler.getTicketNumber();
                    ticketNumberList.add(ticketNumber);

                    latch.countDown();//当前线程调用此方法，则计数减一
                }
            };
            service.execute(runnable);
        }

        System.out.println("当前购票人数："+userNumber+" 人");

        try {
            System.out.println("主线程"+Thread.currentThread().getName()+"等待子线程执行完成...");
            latch.await();//阻塞当前线程，直到计数器的值为0

            //记录购票结束时间
            long entTime = System.currentTimeMillis();
            //开始统计
            System.out.println("票号生成类实例对象数目："+new HashSet(hanlderList).size());
            System.out.println("共出票："+ticketNumberList.size()+"张");
            System.out.println("实际出票："+new HashSet(ticketNumberList).size()+"张");
            System.out.println("出票用时："+(entTime - beginTime)+" 毫秒");
            service.shutdown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}