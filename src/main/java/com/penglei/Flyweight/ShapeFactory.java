package com.penglei.Flyweight;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ShapeFactory
 * @Description TODO
 * @date 2020-05-09 19:55
 */
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}