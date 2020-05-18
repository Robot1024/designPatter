package com.penglei.bridge;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Shape
 * @Description TODO
 * @date 2020-05-09 19:06
 */
public abstract class Shape {

    // 把颜色对象已组合的方式持有
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}