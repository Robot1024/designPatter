package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ColdDrink
 * @Description 抽象类 饮料
 * @date 2020-04-27 02:45
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}