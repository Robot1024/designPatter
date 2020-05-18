package com.penglei.command;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName BuyStock
 * @Description TODO
 * @date 2020-05-09 21:23
 *
 * 创建实现了 Order 接口的实体类。 其实是对 stock buy方法的包装。
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}