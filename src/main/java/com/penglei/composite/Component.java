package com.penglei.composite;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName Component 组件
 * @Description TODO
 * @date 2020-05-09 00:30
 */

public abstract class Component {
    //这个是容器类的抽象类，定义好行为，定义创建移除子容器的方法抽象的。
    //组件名称
    protected String component;

    public String getComponent() {
        return component;
    }

    public Component(String component) {
        this.component = component;
    }

    public abstract void addComposite(Component c); //添加成员

    public abstract void removeComposite(Component c);//移除成员

    public abstract Component getComposite(int i);//获取子容器

    public abstract void operation();//业务方法


}