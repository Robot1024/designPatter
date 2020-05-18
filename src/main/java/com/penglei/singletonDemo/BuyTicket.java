package com.penglei.singletonDemo;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName BuyTicket
 * @Description TODO
 * @date 2020-05-08 20:46
 */
import java.util.*;

public class BuyTicket {

    public static void main(String[] args) {
        // 用户人数
        int userNumber = 100000;
        // 保存用户线程
        Set<Thread> threadSet = new HashSet();

        // 用于存放TicketNumberHandler实例对象
        List<TicketNumberHandler8> hanlderList = new Vector();
//        List<TicketNumberHandler> hanlderList = new ArrayList<>();
        // 保存生成的票号
        List<Long> ticketNumberList = new Vector();
//        List<Long> ticketNumberList = new ArrayList<>();

        // 定义购票线程，一个线程模拟一个用户
        for(int i=0;i<userNumber;i++) {
            Thread t = new Thread() {
                public void run() {
                    // 线程不安全
//                    TicketNumberHandler handler = TicketNumberHandler3.getInstance();
                    // 线程安全
//                    TicketNumberHandler handler = TicketNumberHandler1.getInstance();
//                    TicketNumberHandler handler = TicketNumberHandler2.getInstance();
//                    TicketNumberHandler handler = TicketNumberHandler4.getInstance();
//                    TicketNumberHandler handler = TicketNumberHandler5.getInstance();
//                    TicketNumberHandler handler = TicketNumberHandler6.getInstance();
//                    TicketNumberHandler handler = TicketNumberHandler7.getInstance();
                    TicketNumberHandler8 handler = TicketNumberHandler8.INSTANCE;


                    hanlderList.add(handler);

                    Long ticketNumber = handler.getTicketNumber();
                    ticketNumberList.add(ticketNumber);
                };
            };
            threadSet.add(t);
        }
        System.out.println("当前购票人数："+threadSet.size()+" 人");

        //记录购票开始时间
        long beginTime = System.currentTimeMillis();
        for(Thread t : threadSet) {
            //开始购票
            t.start();
        }

        //记录购票结束时间
        long entTime;
        while(true) {
            //除去mian线程之外的所有线程结果后在记录结束时间
            if(Thread.activeCount() == 2) {
                entTime = System.currentTimeMillis();
                break;
            }
        }
        //开始统计
        System.out.println("出票用时："+(entTime - beginTime)+" 毫秒");
        System.out.println("实际出票线程："+hanlderList.size()+" 人");
        System.out.println("票号生成类实例对象数目："+new HashSet(hanlderList).size());
        System.out.println("共出票："+ticketNumberList.size()+"张");
        System.out.println("实际出票："+new HashSet(ticketNumberList).size()+"张");

    }
}