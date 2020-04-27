package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ChickenBurger
 * @Description 鸡肉汉堡
 * @date 2020-04-27 02:47
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
