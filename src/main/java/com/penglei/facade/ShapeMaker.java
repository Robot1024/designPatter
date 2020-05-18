package com.penglei.facade;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ShapeMaker
 * @Description TODO
 * @date 2020-05-09 15:38
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}