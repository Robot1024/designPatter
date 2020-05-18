package com.penglei.Prototype;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName ShapeCache
 * @Description TODO
 * @date 2020-05-09 18:17
 */
import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();


    // 从map 获取到原型，再通过clone , 返回克隆对象
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        // 判断的clone 对象是不是 相同对象
        // 克隆出来的对象是不同对象
        System.out.println(cachedShape == cachedShape.clone());
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}