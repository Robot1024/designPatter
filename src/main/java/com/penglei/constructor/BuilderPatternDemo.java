package com.penglei.constructor;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName BuilderPatternDemo
 * @Description 测试类
 * @date 2020-04-27 02:52
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        //将一个复杂对象 meal的构建 与 表示分离。

        // 顾客只知道他要套餐1 素汉堡，至于怎么构建不知道
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        // 顾客只知道他要套餐2 鸡肉汉堡，至于怎么构建不知道
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
