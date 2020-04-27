package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Coke
 * @Description 可口可乐实体类
 * @date 2020-04-27 02:47
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

