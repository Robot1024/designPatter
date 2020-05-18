package com.penglei.facade;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Circle
 * @Description TODO
 * @date 2020-05-09 15:37
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}