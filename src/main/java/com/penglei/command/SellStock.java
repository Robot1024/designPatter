package com.penglei.command;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName SellStock
 * @Description TODO
 * @date 2020-05-09 21:24
 *
 * 创建实现了 Order 接口的实体类。 其实是对 stock sell方法的包装。
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}