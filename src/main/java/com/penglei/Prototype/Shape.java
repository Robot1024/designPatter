package com.penglei.Prototype;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Shape
 * @Description TODO
 * @date 2020-05-09 18:13
 */
// 原型模式 先实现了 Cloneable 接口
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}