package com.penglei.command;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Broker
 * @Description TODO
 * @date 2020-05-09 21:27
 *
 * 创建命令调用类。原本 是用 new Stock() 去调用，现在换成 Broker 去调用，调用的方法一order 参数传入
 */
import java.util.ArrayList;
import java.util.List;

public class Broker {

    // 命令集合
    private List<Order> orderList = new ArrayList<Order>();

    //向命令集合中添加命令
    public void takeOrder(Order order){
        orderList.add(order);
    }

    // 执行一条命令
    public void placeOrder(Order order){
        order.execute();
    }

    //执行集合中所有命令
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}