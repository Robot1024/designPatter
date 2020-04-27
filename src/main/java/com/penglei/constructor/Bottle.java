package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Bottle
 * @Description 用于装饮料
 * @date 2020-04-27 02:42
 */
public class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}
