package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Pepsi
 * @Description 百世可乐实体类
 * @date 2020-04-27 02:48
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
