package com.penglei.Prototype;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Square
 * @Description TODO
 * @date 2020-05-09 18:16
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
