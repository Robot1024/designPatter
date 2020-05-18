package com.penglei.Flyweight;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName FlyweightPatternDemo
 * @Description TODO
 * @date 2020-05-09 19:56
 */

// 享元模式就是  工厂模式 + 单例模式 组成的池技术
public class FlyweightPatternDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}