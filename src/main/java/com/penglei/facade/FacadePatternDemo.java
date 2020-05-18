package com.penglei.facade;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName FacadePatternDemo
 * @Description TODO
 * @date 2020-05-09 15:38
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}