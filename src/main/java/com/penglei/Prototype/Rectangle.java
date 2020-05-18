package com.penglei.Prototype;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Rectangle
 * @Description TODO
 * @date 2020-05-09 18:15
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
