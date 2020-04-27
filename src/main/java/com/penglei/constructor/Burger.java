package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Burger
 * @Description 抽象类 汉堡
 * @date 2020-04-27 02:44
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
