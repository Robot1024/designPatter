package com.penglei.bridge;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Client
 * @Description TODO
 * @date 2020-05-09 19:09
 */
public class Client {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
    }
}