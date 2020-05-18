package com.penglei.command;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Stock
 * @Description TODO
 * @date 2020-05-09 21:22
 *
 * 创建一个请求类。如果不是命令模式， 那就是直接调用  new Stock().bug  new Stock().sell
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}