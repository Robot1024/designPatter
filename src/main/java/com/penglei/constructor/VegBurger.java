package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName VegBurger
 * @Description 素菜汉堡
 * @date 2020-04-27 02:46
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

