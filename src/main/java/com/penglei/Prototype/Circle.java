package com.penglei.Prototype;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Circle
 * @Description TODO
 * @date 2020-05-09 18:16
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}