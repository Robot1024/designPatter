package com.penglei.facade;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Rectangle
 * @Description TODO
 * @date 2020-05-09 15:36
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}