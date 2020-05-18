package com.penglei.command;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName CommandPatternDemo
 * @Description TODO
 * @date 2020-05-09 21:37
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        // 真是调用者，如果不用命令模式，调用方式new Stock().buy 或  new Stock().sell
        Stock abcStock = new Stock();


        // 创建被包装的命令对象， 需要把调用者传入进去
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        // 创建代理调用者
        Broker broker = new Broker();
        // 代理调用者向命令集合中添加命令，
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        // 代理调用者执行命令集中所有命令
        broker.placeOrders();


        // 代理调用者  执行一条命令
        broker.placeOrder(buyStockOrder);


    }
}