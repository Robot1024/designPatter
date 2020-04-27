package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName MealBuilder
 * @Description 订单构建者
 * @date 2020-04-27 02:51
 */
public class MealBuilder {

    //套餐1 素汉堡
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    //套餐2 鸡肉汉堡
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}